package com.example.demo.dto;

public class ClienteDto {

	private long idCliente;
	private String nombre;
	private boolean activo;

	public ClienteDto() {
	}

	public ClienteDto(long idCliente, String nombre, boolean activo) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.activo = activo;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		builder.append("ClienteDto [idCliente=");
		builder.append(idCliente);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", activo=");
		builder.append(activo);
		builder.append("]");
		return builder.toString();
	}

}
