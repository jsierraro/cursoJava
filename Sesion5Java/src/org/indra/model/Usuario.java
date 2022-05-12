package org.indra.model;

public class Usuario extends BusinessObject{

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	@Override
	public void validar() throws Exception {
		super.validar();
		if(nombre.equals(null))
			throw new Exception("El nombre está vacío.");
		else if( nombre.length() < 3)
			throw new Exception("El nombre es demasiado corto.");
	}
}
