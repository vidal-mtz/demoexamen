package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CompraDto;

public interface ComprasService {
	void guardar(CompraDto compra);

	List<CompraDto> recuperaCompras(String cliente);

	void actualiza(CompraDto compra);

	void elimina(long compra);
}
