package model;

import java.util.ArrayList;
import model.Producto;

public class Venta {
	private String codigo;
	private String estado;
	private boolean pagado;
	private ArrayList<Producto> productos;

	public Venta(String codigo, String estado, int pagado) {
		this.codigo=codigo;
		this.estado=null;
		this.pagado=false;
		this.productos=new ArrayList<>();
	}

	public String getCodigo() {
		return this.codigo;
	}

	public ArrayList<Producto> getProductos() {
		return  this.productos;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public boolean getPagado() {
		return this.pagado;
	}
}