package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CompraDto;
import com.example.demo.service.ComprasService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class CompraRest {

	private ComprasService service;

	public CompraRest(ComprasService service) {
		this.service = service;
	}

	@PostMapping(value = "/guarda")
	public void guardar(@RequestBody CompraDto compra) {
		service.guardar(compra);
	}

	@GetMapping(value = "/get/{cliente}")
	@ResponseBody
	public List<CompraDto> recuperaCompras(@PathParam(value = "cliente") String cliente) {
		return service.recuperaCompras(cliente);
	}

	@PutMapping(value = "/actualiza")
	public void actualiza(@RequestBody CompraDto compra) {
		service.actualiza(compra);
	}

	@DeleteMapping(value = "remove/{lista}")
	public void elimina(@PathParam(value = "lista") long compra) {
		service.elimina(compra);
	}
}
