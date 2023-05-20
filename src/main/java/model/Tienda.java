package model;

import java.util.ArrayList;
import model.Trabajador;
import model.Bodega;
import model.Cliente;

public class Tienda {
	private String nombre;
	private String horaAtencion;
	private String direccion;
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	private ArrayList<Bodega> bodegas = new ArrayList<Bodega>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public Tienda(String nombre, String horaAtencion, String direccion) {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getHoraAtencion() {
		return this.horaAtencion;
	}

	public void setHoraAtencion(String horaAtencion) {
		this.horaAtencion = horaAtencion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean realizarVenta(Carrito carrito) {
		throw new UnsupportedOperationException();
	}

	public boolean addCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public boolean addTrabajador(Trabajador trabajador) {
		throw new UnsupportedOperationException();
	}

	public boolean removeCliente(String rutCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean removeTrabajador(String rutTrabajador) {
		throw new UnsupportedOperationException();
	}

	public boolean addProducto(Producto producto) {
		throw new UnsupportedOperationException();
	}

	public boolean removeProducto(String codigo) {
		throw new UnsupportedOperationException();
	}

	public boolean cancelarCompra(String codigoCompra) {
		throw new UnsupportedOperationException();
	}

	public boolean addProductoCarrito(Carrito carrito, Producto producto) {
		throw new UnsupportedOperationException();
	}

	public boolean removeProductoCarrito(Carrito carrito, String codigoProducto) {
		throw new UnsupportedOperationException();
	}
}