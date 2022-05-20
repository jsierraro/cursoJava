package org.indra.service;

import org.indra.models.*;
import org.indra.repository.IPeliculaRepository;
import org.indra.repository.PeliculaMemoRepository;

public class PeliculaService implements IPeliculaService{
	
	IPeliculaRepository repository;

	public PeliculaService(IPeliculaRepository repository) {
//		this.repository = new PeliculaMemoRepository(); //Quiero que esta relacion no quede fija
		this.repository=repository;
	}
	
	@Override
	public String getMsj() {
		return "Esto es una maravilla";
	}
	
	private void crearBean() {
		System.out.println("Bean creado");
	}
	
	private void destruirBean() {
		System.out.println("Bean destruido");
	}
	
	@Override
	public void add(Pelicula pelicula) {
		this.repository.add(pelicula);
		System.out.println(String.format("Agregamos la pelicula %s de la fecha %s en el servicio.",
				pelicula.getTitulo(), pelicula.getFecha().toString()));
	}

	@Override
	public Pelicula findByName(String name) {
		return this.repository.findByName(name);
	}

	@Override
	public Pelicula findById(int id) {
		return this.repository.findById(id);
	}

}
