package model;

public class Producto {
	private String codigo;
	private String nombre;
	private int stock;
	private String categoria;
	private Date fechaVencimiento;

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

	public Producto(String codigo, String nombre, int stock, String categoria, Date fechaVencimiento) {
		throw new UnsupportedOperationException();
	}
}