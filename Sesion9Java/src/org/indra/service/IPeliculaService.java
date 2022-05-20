package org.indra.service;

import org.indra.models.*;

public interface IPeliculaService {
	
	void add(Pelicula pelicula);
	String getMsj();
	Pelicula findByName(String name);
	Pelicula findById(int id);
	
}
