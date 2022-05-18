package org.indra.models;

import java.time.LocalDate;

public class Pelicula extends ObjetoDeNegocio{

	private String nombre;
	private LocalDate fecSalida;
	private String director;
	private int minDUracion;
	
	public Pelicula(String nombre, LocalDate fecSalida, String director, int minDUracion) {
		super();
		this.nombre = nombre;
		this.fecSalida = fecSalida;
		this.director = director;
		this.minDUracion = minDUracion;
	}
	
	public Pelicula () {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public LocalDate getFecSalida() {
		return fecSalida;
	}
	public void setFecSalida(LocalDate fecSalida) {
		this.fecSalida = fecSalida;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getMinDUracion() {
		return minDUracion;
	}
	public void setMinDUracion(int minDUracion) {
		this.minDUracion = minDUracion;
	}
	
	
}
