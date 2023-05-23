package model;

import java.util.ArrayList;
import model.Producto;

public class Bodega {
	private String codigoBodega;
	private String direccion;
	private String horario;
	private JefeDeBodega jefeDeBodega;
	private ArrayList<Producto> productos;

	public Bodega(String codigoBodega, String direccion, String horario, JefeDeBodega jefeDeBodega) {
		this.codigoBodega = codigoBodega;
		this.direccion = direccion;
		this.horario = horario;
		this.jefeDeBodega = jefeDeBodega;
		this.productos = new ArrayList<>();
	}

	public String getCodigoBodega() {
		return codigoBodega;
	}

	public JefeDeBodega getJefeDeBodega() {
		return jefeDeBodega;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
}