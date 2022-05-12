package org.indra.model;

public abstract class EntidadSistemaFicheros {

	protected static IObserver miradoPor;
	
	public static void RegistrarQuienMira(IObserver obs) {
//		EntidadSistemaFicheros.miradoPor = obs; Tambien se peude sin el nombre de la clase
		miradoPor = obs;
	}
	
	private String nombre = null;

	public EntidadSistemaFicheros(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int calcularTamanio();
	
}
