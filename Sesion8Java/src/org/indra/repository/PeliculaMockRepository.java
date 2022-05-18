package org.indra.repository;

import java.util.*;

import org.indra.models.Pelicula;

public class PeliculaMockRepository implements IPeliculaRepository{

	private List<Pelicula> peliculas = new ArrayList<Pelicula>();
	
	@Override
	public List<Pelicula> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pelicula findById(int id) throws Exception {
		// Vamos a asumir que hay uno (si no hay, va a tirar excepcion)
		return peliculas.stream().filter(e -> e.getId() == id).findFirst().get();
	}

	@Override
	public Pelicula findByName(String name) throws Exception {
		return peliculas.stream().filter(e -> e.getNombre().equals(name)).findFirst().get();
	}

	@Override
	public void add(Pelicula objeto) throws Exception {
		this.peliculas.add(objeto);
		objeto.setId(this.peliculas.stream().mapToInt(p -> p.getId()).max().getAsInt() +1);
	}

	@Override
	public void delete(int id) throws Exception {
		this.peliculas.remove(peliculas.indexOf(findById(id)));
	}

	@Override
	public void update(Pelicula objeto) throws Exception {
		delete(objeto.getId());
		add(objeto);
	}

}
