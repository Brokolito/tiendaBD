package model;

import java.util.ArrayList;
import model.Producto;

public class Carrito {
	private ArrayList<Producto> productos;
	public Carrito() {
		this.productos = new ArrayList<>();
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
}