package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.ClienteData;
import com.example.demo.dto.CompraDto;
import com.example.demo.entity.Cliente;
import com.example.demo.service.ComprasService;

@Service
public class ComprasServiceImpl implements ComprasService {

	@Autowired
	private ClienteData clienteData;
	
	@Override
	public void guardar(CompraDto compra) {
		
		System.out.println(compra);
		
		Optional<Cliente> cliente = clienteData.findById(compra.getCliente().getIdCliente());
		if (!cliente.isPresent()) {
			Cliente newCliente = new Cliente();
			newCliente.setIdCliente(compra.getCliente().getIdCliente());
			newCliente.setNombre(compra.getCliente().getNombre());
			newCliente.setActivo(true);
			
			clienteData.save(newCliente);
			
			System.out.println("Se guardo cliente");
		}
			
	}

	@Override
	public List<CompraDto> recuperaCompras(String cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualiza(CompraDto compra) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elimina(long compra) {
		// TODO Auto-generated method stub
		
	}

}
