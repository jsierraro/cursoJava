package org.indra.repository;

import org.indra.models.Pelicula;

public class PeliculaDbRepository implements IPeliculaRepository{

	Pelicula p;
	
	@Override
	public void add(Pelicula pelicula) {
		System.out.println("Agrego en la base de datos");
		this.p = pelicula;
	}

	@Override
	public Pelicula findById(int id) {
		System.out.println("Recojo de la base de datos");
		return p;
	}

	@Override
	public Pelicula findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
