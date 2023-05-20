package model;

import java.util.ArrayList;
import model.Producto;

public class Venta {
	private String codigo;
	private String estado;
	private int pagado;
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public Venta(String codigo) {
		throw new UnsupportedOperationException();
	}

	public String getCodigo() {
		return this.codigo;
	}

	public ArrayList<Producto> getProductos() {
		throw new UnsupportedOperationException();
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPagado() {
		return this.pagado;
	}
}