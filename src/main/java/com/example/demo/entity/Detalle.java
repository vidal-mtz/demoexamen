package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_DETALLE_LISTA")
public class Detalle {
	@EmbeddedId
	private DetalleId id;

	@Column(name = "DET_CANTIDAD")
	private int cantidad;

	public Detalle() {
	}

	public Detalle(DetalleId id, int cantidad) {
		this.id = id;
		this.cantidad = cantidad;
	}

	public DetalleId getId() {
		return id;
	}

	public void setId(DetalleId id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
