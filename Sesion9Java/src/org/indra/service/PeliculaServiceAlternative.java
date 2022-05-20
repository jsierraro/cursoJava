package org.indra.service;

import org.indra.models.*;

public class PeliculaServiceAlternative implements IPeliculaService{

	private String msj = "Se utiliza el servicio alternativo.";
	
	public String getMsj() {
		return msj;
	}
	public void setMsj(String msj) {
		this.msj = msj;
	}
	
	private void crearBeanAlt() {
		System.out.println("Bean creado");
	}
	
	private void destruirBeanAlt() {
		System.out.println("Bean destruido");
	}
	
	@Override
	public void add(Pelicula pelicula) {
		System.out.println(msj);
	}
	@Override
	public Pelicula findByName(String name) {
		System.out.println("findByName alternativo");
		return null;
	}
	@Override
	public Pelicula findById(int id) {
		System.out.println("findById alternativo");
		return null;
	}
	
}
