package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//@Entity
//@IdClass(DetalleId.class)
//@Table(name = "TBL_DETALLE_LISTA")
public class Detalle {

//	@Id
//	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "ID_LISTA", nullable = false)
//	private ListaCompra compra;
//
//	@Id
//	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "ID_PRODCUTO", nullable = false)
//	private Producto producto;
//
//	@Column(name = "DET_CANTIDAD")
//	private int cantidad;
//
//	public ListaCompra getCompra() {
//		return compra;
//	}
//
//	public void setCompra(ListaCompra compra) {
//		this.compra = compra;
//	}
//
//	public Producto getProducto() {
//		return producto;
//	}
//
//	public void setProducto(Producto producto) {
//		this.producto = producto;
//	}
//
//	public int getCantidad() {
//		return cantidad;
//	}
//
//	public void setCantidad(int cantidad) {
//		this.cantidad = cantidad;
//	}
}
