package model;

public class JefeDeBodega extends Trabajador {

	public JefeDeBodega(String rut, String nombre, String horario, String titulo, String telefono, String correo) {
		super(rut, nombre, horario, titulo, telefono, correo,"Jefe de Bodega");
	}

	public String getType() {
		return "Jefe de Bodega";
	}
	@Override
	public String toString() {
		return super.toString();
	}
}