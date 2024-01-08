package com.example.demo.dto;

public class ProductoDto {

	private long idProducto;
	private String clave;
	private String descripcion;
	private boolean activo;

	public ProductoDto(long idProducto, String clave, String descripcion, boolean activo) {
		this.idProducto = idProducto;
		this.clave = clave;
		this.descripcion = descripcion;
		this.activo = activo;
	}

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductoDto [idProducto=");
		builder.append(idProducto);
		builder.append(", clave=");
		builder.append(clave);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", activo=");
		builder.append(activo);
		builder.append("]");
		return builder.toString();
	}

}
