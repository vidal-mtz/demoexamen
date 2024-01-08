package com.example.demo.entity;

import java.io.Serializable;

public class DetalleId implements Serializable {
	private static final long serialVersionUID = 7891768974509559661L;

	private long idLista;
	private long idProducto;

	public DetalleId(long idLista, long idProducto) {
		super();
		this.idLista = idLista;
		this.idProducto = idProducto;
	}

	public long getIdLista() {
		return idLista;
	}

	public void setIdLista(long idLista) {
		this.idLista = idLista;
	}

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

}
