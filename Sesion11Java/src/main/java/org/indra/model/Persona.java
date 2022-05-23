package org.indra.model;

public class Persona extends ObjetoDeNegocio {

	private int id;
	private String nombre;
	private String apellido;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String toString() {
		return String.format("ID: %d | Nombre: %s | Apellido:%s", this.id,this.nombre,this.apellido);
	}
	
}
