package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_CLIENTES")
public class Cliente {

	@Id
	@Column(name = "ID_CLIENTE")
	private long idCliente;

	@Column(name = "CLI_NOMBRE", length = 50, nullable = false)
	private String nombre;

	@Column(name = "CLI_ACTIVO")
	private boolean activo;

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
}
