package com.example.demo.dto;

public class DetalleDto {
	private ProductoDto producto;
	private int cantidad;

	public DetalleDto() {
	}

	public DetalleDto(ProductoDto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public ProductoDto getProducto() {
		return producto;
	}

	public void setProducto(ProductoDto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DetalleDto [producto=");
		builder.append(producto);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append("]");
		return builder.toString();
	}
}
