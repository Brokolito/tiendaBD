package model;

import java.util.ArrayList;
import model.Venta;

public class Cliente {
	private String rut;
	private String nombre;
	private String direccion;
	private String telefono;
	private Carrito carrito;
	private ArrayList<Venta> ventas;

	public Cliente(String rut, String nombre, String direccion, String telefono) {
		this.rut=rut;
		this.nombre=nombre;
		this.direccion=direccion;
		this.telefono=telefono;
		this.ventas=new ArrayList<>();
		this.carrito = new Carrito();
	}
	public String getRut() {
		return this.rut;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"rut='" + rut + '\'' +
				", nombre='" + nombre + '\'' +
				", direccion='" + direccion + '\'' +
				", telefono='" + telefono + '\'' +
				", carrito=" + carrito +
				", ventas=" + ventas +
				'}';
	}
}