package Clases;

import java.util.ArrayList;

public class Producto {
	private String identificador;
	private String nombre;
	private String medida;
	private String nombre_cientifico;
	private String nombre_vulgar;
	private String descripcion;
	private float precio_costo;
	private float precio_venta;
	private int limite_inferior;
	private int cantidad;
	private ArrayList<String> proveedores = new ArrayList();
	
	public Producto(){
		identificador = "";
		nombre = "";
		medida = "";
		nombre_cientifico = "";
		nombre_vulgar = "";
		descripcion = "";
		precio_costo = 0;
		precio_venta = 0;
		limite_inferior = 0;
	}

	public String getIdentificador() {
		return identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMedida() {
		return medida;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre_cientifico() {
		return nombre_cientifico;
	}

	public String getNombre_vulgar() {
		return nombre_vulgar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public float getPrecio_costo() {
		return precio_costo;
	}

	public float getPrecio_venta() {
		return precio_venta;
	}

	public int getLimite_inferior() {
		return limite_inferior;
	}

	public ArrayList<String> getProveedores() {
		return proveedores;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public void setNombre_cientifico(String nombre_cientifico) {
		this.nombre_cientifico = nombre_cientifico;
	}

	public void setNombre_vulgar(String nombre_vulgar) {
		this.nombre_vulgar = nombre_vulgar;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecio_costo(float precio_costo) {
		this.precio_costo = precio_costo;
	}

	public void setPrecio_venta(float precio_venta) {
		this.precio_venta = precio_venta;
	}

	public void setLimite_inferior(int limite_inferior) {
		this.limite_inferior = limite_inferior;
	}

	public void setProveedores(ArrayList<String> proveedores) {
		this.proveedores = proveedores;
	}

	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", \nnombre="
				+ nombre + ", \nmedida=" + medida + ", \nnombre_cientifico="
				+ nombre_cientifico + ", \nnombre_vulgar=" + nombre_vulgar
				+ ", \ndescripcion=" + descripcion + ", \nprecio_costo="
				+ precio_costo + ", \nprecio_venta=" + precio_venta
				+ ", \nlimite_inferior=" + limite_inferior + ", \nproveedores="
				+ proveedores + "]";
	}
	
	

}
