package model;

public class JefeDeBodega extends Trabajador {

	public JefeDeBodega(String rut, String nombre, String horario, String titulo, String telefono, String correo) {
		super(rut, nombre, horario, titulo, telefono, correo);
	}

	public String getType() {
		throw new UnsupportedOperationException();
	}
}