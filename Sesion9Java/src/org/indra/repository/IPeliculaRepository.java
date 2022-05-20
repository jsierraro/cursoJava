package org.indra.repository;

import org.indra.models.*;

public interface IPeliculaRepository {

	void add(Pelicula pelicula);
	Pelicula findById(int id);
	Pelicula findByName(String name);
	
}
