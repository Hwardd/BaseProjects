package com.tienda.front.shelly.model;

import java.util.List;

public class ProductoVender {

	String id;
	String nombre;
	String firstimagen;
	private List<String> imagenes;
	int precio;
	int cantidad;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getFirstimagen() {
		return firstimagen;
	}
	public void setFirstimagen(String firstimagen) {
		this.firstimagen = firstimagen;
	}
	public List<String> getImagenes() {
		return imagenes;
	}
	public void setImagenes(List<String> imagenes) {
		this.imagenes = imagenes;
	}
	
}
