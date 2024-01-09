package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TBL_PRODUCTOS")
public class Producto {
	@Id
	@Column(name = "ID_PRODUCTO")
	private long idProducto;

	@Column(name = "PRO_CLAVE", length = 15, nullable = false)
	private String clave;

	@Column(name = "PRO_DESCRIPCION", length = 150, nullable = false)
	private String descripcion;

	@Column(name = "PRO_ACTIVO")
	private boolean activo;

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
