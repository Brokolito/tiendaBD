package model;

import java.util.ArrayList;
import model.Venta;

public class AdministradorDeCajero extends Trabajador {
	private ArrayList<Venta> ventas = new ArrayList<Venta>();

	public AdministradorDeCajero(String rut, String nombre, String horario, String titulo, String telefono, String correo) {
		super(rut, nombre, horario, titulo, telefono, correo);
	}

	public String getType() {
		return "Administrador de cajero";
	}
	@Override
	public String toString() {
		return super.toString();
	}
}