package org.indra.models;

public abstract class Animal {

	public abstract String getSonido();
	public void mostrar(IDibujador dibu) {
		dibu.mostrar(this);
	}
	
}
