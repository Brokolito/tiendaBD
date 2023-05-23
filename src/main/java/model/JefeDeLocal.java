package model;

public class JefeDeLocal extends Trabajador {

	public JefeDeLocal(String rut, String nombre, String horario, String titulo, String telefono, String correo) {
		super(rut, nombre, horario, titulo, telefono, correo);
	}

	public String getType() {
		return "Jefe de Local";
	}

	@Override
	public String toString() {
		return super.toString();
	}
}