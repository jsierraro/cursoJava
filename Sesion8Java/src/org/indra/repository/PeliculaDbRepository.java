package org.indra.repository;

import java.util.List;

import org.indra.models.Pelicula;

public class PeliculaDbRepository implements IPeliculaRepository {

	@Override
	public List<Pelicula> findAll() throws Exception {
		throw new Exception("No implementado");
	}

	@Override
	public Pelicula findById(int id) throws Exception {
		throw new Exception("No implementado");
	}

	@Override
	public Pelicula findByName(String name) throws Exception {
		throw new Exception("No implementado");
	}

	@Override
	public void add(Pelicula objeto) throws Exception {
		throw new Exception("No implementado");

	}

	@Override
	public void delete(int id) throws Exception {
		throw new Exception("No implementado");

	}

	@Override
	public void update(Pelicula objeto) throws Exception {
		throw new Exception("No implementado");

	}

}
