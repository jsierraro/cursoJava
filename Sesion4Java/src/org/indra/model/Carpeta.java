package org.indra.model;

import java.util.*;

public class Carpeta extends EntidadSistemaFicheros {

	private List<EntidadSistemaFicheros> hijos = new ArrayList<EntidadSistemaFicheros>();

	public Carpeta(String nombre) {
		super(nombre);
		if (miradoPor != null)
			Archivo.miradoPor.notificar(String.format("Creando carpeta %s ...", nombre));

	}

	public void addHijo(EntidadSistemaFicheros hijo) {
		if (!this.hijos.contains(hijo)) {
			if (miradoPor != null)
				Archivo.miradoPor.notificar(
						String.format("Agregando entidad %s a carpeta %s ...", hijo.getNombre(), this.getNombre()));
			this.hijos.add(hijo);
		}

	}

	@Override
	public int calcularTamanio() {
		int tam = 0;
		for (EntidadSistemaFicheros elem : hijos) {
			tam += elem.calcularTamanio();
		}
		return tam;
	}

}
