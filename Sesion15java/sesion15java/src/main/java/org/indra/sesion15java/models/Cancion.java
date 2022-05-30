package org.indra.sesion15java.models;

import lombok.*;

@Getter
@Setter
public class Cancion extends ObjetoDeNegocio {

	private String nombre;
	private String artista;
	private int duracionSegundos;

}
