package model;

public abstract class Trabajador {
	private String rut;
	private String nombre;
	private String horario;
	private String titulo;
	private String telefono;
	private String correo;

	public Trabajador(String rut, String nombre, String horario, String titulo, String telefono, String correo) {
		this.rut = rut;
		this.nombre = nombre;
		this.horario = horario;
		this.titulo = titulo;
		this.telefono = telefono;
		this.correo = correo;
	}

	public String getRut() {
		return this.rut;
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
}