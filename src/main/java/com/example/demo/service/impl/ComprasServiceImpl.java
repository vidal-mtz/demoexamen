package com.example.demo.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.ClienteData;
import com.example.demo.data.CompraData;
import com.example.demo.data.DetalleData;
import com.example.demo.data.ProductoData;
import com.example.demo.dto.CompraDto;
import com.example.demo.dto.DetalleDto;
import com.example.demo.entity.Cliente;
import com.example.demo.entity.Detalle;
import com.example.demo.entity.DetalleId;
import com.example.demo.entity.ListaCompra;
import com.example.demo.entity.Producto;
import com.example.demo.service.ComprasService;

@Service
public class ComprasServiceImpl implements ComprasService {
	private static final Logger LOGGER = LogManager.getLogger(ComprasServiceImpl.class);

	@Autowired
	private ProductoData productoData;

	@Autowired
	private ClienteData clienteData;

	@Autowired
	private CompraData compraData;

	@Autowired
	private DetalleData detalleData;

	ModelMapper mapper;

	public ComprasServiceImpl() {
		this.mapper = new ModelMapper();
	}

	@Override
	@Transactional
	public void guardar(CompraDto compra) {
		LOGGER.info(compra);

		ListaCompra antCompra = compraData.findFistByNombre(compra.getNombre());

		if (antCompra != null) {
			LOGGER.info("ya existe lista {}", compra.getNombre());
			return;
		}

		ListaCompra newCompra = new ListaCompra();

		Optional<Cliente> cliente = clienteData.findById(compra.getCliente().getIdCliente());
		if (!cliente.isPresent()) {
			Cliente newCliente = new Cliente();
			newCliente.setIdCliente(compra.getCliente().getIdCliente());
			newCliente.setNombre(compra.getCliente().getNombre());
			newCliente.setActivo(true);

			newCompra.setCliente(newCliente);
		} else
			newCompra.setCliente(cliente.get());

		newCompra.setNombre(compra.getNombre());
		newCompra.setFechaRegistro(LocalDate.now());
		newCompra.setFechaUltimaActualizacion(LocalDate.now());
		newCompra.setActivo(true);

		List<Detalle> list = new ArrayList<>();
		Detalle detalle;
		DetalleId detId;
		for (DetalleDto prod : compra.getDetalle()) {
			detalle = new Detalle();

			Optional<Producto> producto = productoData.findById(prod.getProducto().getIdProducto());
			if (!producto.isPresent()) {
				Producto newProducto = new Producto();
				newProducto.setIdProducto(prod.getProducto().getIdProducto());
				newProducto.setClave(prod.getProducto().getClave());
				newProducto.setDescripcion(prod.getProducto().getDescripcion());
				newProducto.setActivo(true);
				productoData.save(newProducto);
				LOGGER.info("Se guardo producto {}", prod.getProducto().getIdProducto());

				detId = new DetalleId(newCompra, newProducto);
			} else
				detId = new DetalleId(newCompra, producto.get());

			detalle.setId(detId);
			detalle.setCantidad(prod.getCantidad());
			list.add(detalle);
		}
		newCompra.setDetalle(list);

		compraData.save(newCompra);
		LOGGER.info("Se guardo la nueva lista {}", compra.getNombre());
	}

	@Override
	public List<CompraDto> recuperaCompras(long clienteId) {
		List<CompraDto> result = new ArrayList<>();

		Optional<Cliente> cliente = clienteData.findById(clienteId);
		if (cliente.isPresent()) {

			List<ListaCompra> lista = compraData.findByCliente(cliente.get());

			for (ListaCompra compra : lista) {
				result.add(this.mapper.map(compra, CompraDto.class));

				LOGGER.info("Elemento {}", compra.getNombre());
			}

		}
		return result;
	}

	@Override
	public void actualiza(CompraDto compra) {
		LOGGER.info(compra);

		Optional<ListaCompra> antCompra = compraData.findById(compra.getIdLista());

		if (!antCompra.isPresent()) {
			LOGGER.info("No se encontro la lista {}", compra.getIdLista());
			return;
		}

		ListaCompra newCompra = antCompra.get();

		newCompra.setNombre(compra.getNombre());
		newCompra.setFechaUltimaActualizacion(LocalDate.now());
		newCompra.setActivo(true);

		List<Detalle> list = newCompra.getDetalle();
		Detalle detalle;
		DetalleId detId;
		for (DetalleDto prod : compra.getDetalle()) {
			// validar si existe el producto
			Optional<Producto> producto = productoData.findById(prod.getProducto().getIdProducto());
			if (!producto.isPresent()) {
				Producto newProducto = new Producto();
				newProducto.setIdProducto(prod.getProducto().getIdProducto());
				newProducto.setClave(prod.getProducto().getClave());
				newProducto.setDescripcion(prod.getProducto().getDescripcion());
				newProducto.setActivo(true);

				productoData.save(newProducto);
				LOGGER.info("Se guardo producto");

				detId = new DetalleId(newCompra, newProducto);

				detalle = new Detalle();
				detalle.setId(detId);
				detalle.setCantidad(prod.getCantidad());
				list.add(detalle);
			} else {
				// validar si existe en el detalle
				detId = new DetalleId(newCompra, producto.get());
				Optional<Detalle> detExiste = detalleData.findById(detId);
				if (!detExiste.isPresent()) {
					detalle = new Detalle();
					detalle.setId(detId);
					detalle.setCantidad(prod.getCantidad());
					list.add(detalle);
				}
			}
		}

		compraData.save(newCompra);
		LOGGER.info("Se actualizo la lista {}", compra.getIdLista());
	}

	@Override
	public void elimina(long compra) {
		Optional<ListaCompra> encontrada = compraData.findById(compra);

		if (encontrada.isPresent()) {
			compraData.delete(encontrada.get());
			LOGGER.info("Se elimino lista {}", encontrada.get().getNombre());
		}
	}

}
