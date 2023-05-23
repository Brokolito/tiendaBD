package model;

import java.util.ArrayList;
import model.Trabajador;
import model.Bodega;
import model.Cliente;

public class Tienda {
	private String nombre;
	private String horaAtencion;
	private String direccion;
	private ArrayList<Trabajador> trabajadores;
	private ArrayList<Bodega> bodegas;
	private ArrayList<Cliente> clientes;
	private ArrayList<Producto> productos;

	public Tienda(String nombre, String horaAtencion, String direccion) {
		this.nombre=nombre;
		this.horaAtencion=horaAtencion;
		this.direccion=direccion;
		this.trabajadores = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.bodegas = new ArrayList<>();
		this.productos = new ArrayList<>();
	}

	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public ArrayList<Bodega> getBodegas() {
		return bodegas;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
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



	public void addCliente(Cliente cliente) {
		if(buscarCliente(cliente)== null){
			clientes.add(cliente);
		}
	}
	public Cliente buscarCliente(Cliente cliente){
		for( Cliente cliente1 : this.clientes){
			if(cliente1.getRut().equals(cliente.getRut())){
				return cliente;
			}
		}
		return null;
	}
	public void removeCliente(String rutCliente) {
		this.clientes.removeIf(cliente -> cliente.getRut().equals(rutCliente));
	}
	public void addTrabajador(Trabajador trabajador) {
		if (buscarTrabajador(trabajador)==null){
			trabajadores.add(trabajador);
		}
	}
	public Trabajador buscarTrabajador(Trabajador trabajador){
		for(Trabajador trabajador1 : this.trabajadores){
			if(trabajador1.getRut().equals(trabajador.getRut())){
				return trabajador;
			}
		}
		return null;
	}

	public void removeTrabajador(String rutTrabajador) {
		this.trabajadores.removeIf(trabajador -> trabajador.getRut().equals(rutTrabajador));
	}
	public void addBodega(Bodega bodega){
		if(buscarBodega(bodega)==null){
			bodegas.add(bodega);
		}
	}

	public Bodega buscarBodega(Bodega bodega){
		for (Bodega bodega1 : this.bodegas){
			if (bodega1.getCodigoBodega().equals(bodega.getCodigoBodega())){
				return bodega1;
			}
		}
		return null;
	}
	public void removeBodega(String codigoBodega){
		this.bodegas.removeIf(bodega -> bodega.getCodigoBodega().equals(codigoBodega));
	}
	public void addProductoBodega(Bodega bodega, Producto producto) {
		if(buscarProductoBodega(bodega,producto)==null){
			bodega.getProductos().add(producto);
		}
	}
	public Producto buscarProductoBodega(Bodega bodega, Producto producto){
		for(Producto producto1 : bodega.getProductos()){
			if(producto1.getCodigo().equals(producto.getCodigo())){
				return producto;
			}
		}
		return null;
	}

	public void removeProductoBodega(Bodega bodega, String codigo) {
		bodega.getProductos().removeIf(producto -> producto.getCodigo().equals(codigo));
	}
	public void addProductoTienda(Producto producto) {
		if(buscarProductoTienda(producto)==null){
			productos.add(producto);
		}
	}
	public Producto buscarProductoTienda(Producto producto){
		for(Producto producto1 : this.productos){
			if(producto1.getCodigo().equals(producto.getCodigo())){
				return producto;
			}
		}
		return null;
	}

	public void removeProductoTienda(String codigo) {
		this.productos.removeIf(producto -> producto.getCodigo().equals(codigo));
	}

	public boolean cancelarCompra(Venta venta) {
		if (venta.getEstado()==null){
			return true;
		}
		return false;
	}

	public boolean addProductoCarrito(Carrito carrito, Producto producto) {
		if (buscarProductoTienda(producto)!=null){
			carrito.getProductos().add(producto);
			return true;
		}
		return false;
	}

	public void removeProductoCarrito(Carrito carrito, String codigoProducto) {
		for(Producto producto : carrito.getProductos()){
			if (producto.getCodigo().equals(codigoProducto)){
				carrito.getProductos().remove(producto);
			}
		}
	}
	public boolean realizarVenta(Venta venta) {
		return venta.getPagado();
	}
}