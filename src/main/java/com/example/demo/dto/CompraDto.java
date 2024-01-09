package com.example.demo.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CompraDto {
	private long idLista;
	private ClienteDto cliente;
	private String nombre;
	private LocalDate fechaRegistro;
	private LocalDate fechaUltimaActualizacion;
	private boolean activo;
	private List<DetalleDto> detalle;

	public CompraDto() {
		setDetalle(null);
	}

	public CompraDto(long idLista, ClienteDto cliente, String nombre, LocalDate fechaRegistro,
			LocalDate fechaUltimaActualizacion, boolean activo) {
		this.idLista = idLista;
		this.cliente = cliente;
		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
		this.activo = activo;
		setDetalle(null);
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

	public List<DetalleDto> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetalleDto> detalle) {
		if (detalle == null)
			this.detalle = new ArrayList<>();
		else
			this.detalle = detalle;
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
		builder.append(", detalle=");
		builder.append(detalle);
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
