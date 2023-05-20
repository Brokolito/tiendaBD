package model;

import java.util.ArrayList;
import model.Producto;

public class Bodega {
	private String direccion;
	private String horario;
	private JefeDeBodega jefeDeBodega;
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public Bodega(String direccion, String horario) {
		throw new UnsupportedOperationException();
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