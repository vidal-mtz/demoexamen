package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Embeddable
public class DetalleId implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@MapsId("ID_LISTA")
	@JoinColumn(name = "DET_ID_LISTA", nullable = false, insertable = false, updatable = false)
	private ListaCompra compra;

	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@MapsId("ID_PRODUCTO")
	@JoinColumn(name = "DET_ID_PRODUCTO", nullable = false, insertable = false, updatable = false)
	private Producto producto;

	public DetalleId() {
	}

	public DetalleId(ListaCompra compra, Producto producto) {
		this.compra = compra;
		this.producto = producto;
	}

	public ListaCompra getCompra() {
		return compra;
	}

	public void setCompra(ListaCompra compra) {
		this.compra = compra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
