package model;

import java.util.ArrayList;
import model.Venta;

public class AdministradorDeCajero extends Trabajador {
	private ArrayList<Venta> ventas = new ArrayList<Venta>();

	public String getType() {
		throw new UnsupportedOperationException();
	}
}