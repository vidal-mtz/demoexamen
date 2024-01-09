package com.example.demo.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cliente;
import com.example.demo.entity.ListaCompra;

@Repository
public interface CompraData extends JpaRepository<ListaCompra, Long> {
	ListaCompra findFistByNombre(String nombre);

	List<ListaCompra> findByCliente(Cliente cliente);
}
