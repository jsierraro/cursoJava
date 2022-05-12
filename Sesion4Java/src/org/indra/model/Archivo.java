package org.indra.model;

public class Archivo extends EntidadSistemaFicheros{

	private int tamanio;
	
	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public Archivo(String nombre, int tamanio) {
		super(nombre);
		this.tamanio=tamanio;
		if(miradoPor!=null) Archivo.miradoPor.notificar(String.format("Creando archivo %s con tamaño %d bytes ...",nombre,tamanio));
	}
	
	public Archivo(String nombre) {
		super(nombre);
		this.tamanio=0;
		if(miradoPor!=null) Archivo.miradoPor.notificar(String.format("Creando archivo %s con tamaño %d bytes ...",nombre,tamanio));
	}

	@Override
	public int calcularTamanio() {
		return this.tamanio;
	}

}
