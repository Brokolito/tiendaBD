package model;

public abstract class Trabajador {
	private String rut;
	private String nombre;
	private String horario;
	private String titulo;
	private String telefono;
	private String correo;
	private String cargo;

	public Trabajador(String rut, String nombre, String horario, String titulo, String telefono, String correo, String cargo) {
		this.rut = rut;
		this.nombre = nombre;
		this.horario = horario;
		this.titulo = titulo;
		this.telefono = telefono;
		this.correo = correo;
		this.cargo = cargo;
	}

	public String getRut() {
		return this.rut;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public abstract String getType();

	@Override
	public String toString() {
		return "Trabajador{" +
				"rut='" + rut + '\'' +
				", nombre='" + nombre + '\'' +
				", horario='" + horario + '\'' +
				", titulo='" + titulo + '\'' +
				", telefono='" + telefono + '\'' +
				", correo='" + correo + '\'' +
				", cargo='" + cargo + '\'' +
				'}';
	}
}