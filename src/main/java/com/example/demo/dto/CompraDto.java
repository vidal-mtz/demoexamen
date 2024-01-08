package com.example.demo.dto;

import java.time.LocalDate;

public class CompraDto {
	private long idLista;
	private ClienteDto cliente;
	private String nombre;
	private LocalDate fechaRegistro;
	private LocalDate fechaUltimaActualizacion;
	private boolean activo;

	public CompraDto(long idLista, ClienteDto cliente, String nombre, LocalDate fechaRegistro,
			LocalDate fechaUltimaActualizacion, boolean activo) {
		super();
		this.idLista = idLista;
		this.cliente = cliente;
		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
		this.activo = activo;
	}

	public long getIdLista() {
		return idLista;
	}

	public void setIdLista(long idLista) {
		this.idLista = idLista;
	}

	public ClienteDto getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public LocalDate getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}

	public void setFechaUltimaActualizacion(LocalDate fechaUltimaActualizacion) {
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompraDto [idLista=");
		builder.append(idLista);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append(", fechaUltimaActualizacion=");
		builder.append(fechaUltimaActualizacion);
		builder.append(", activo=");
		builder.append(activo);
		builder.append("]");
		return builder.toString();
	}

}
