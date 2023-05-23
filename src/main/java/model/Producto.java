package model;

import java.sql.Date;

public class Producto {
	private String codigo;
	private String nombre;
	private int stock;
	private String categoria;
	private Date fechaVencimiento;

	public Producto(String codigo, String nombre, int stock, String categoria, Date fechaVencimiento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
		this.categoria = categoria;
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	@Override
	public String toString() {
		return "Producto{" +
				"codigo='" + codigo + '\'' +
				", nombre='" + nombre + '\'' +
				", stock=" + stock +
				", categoria='" + categoria + '\'' +
				", fechaVencimiento=" + fechaVencimiento +
				'}';
	}
}