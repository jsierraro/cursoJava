package org.indra.services;

import org.indra.models.*;
import org.indra.repository.IPeliculaRepository;
import org.indra.repository.PeliculaRepositoryFactory;

public class PeliculaService {
	
	public void Add(Pelicula pelicula) throws Exception {
		IPeliculaRepository repo = PeliculaRepositoryFactory.getInstance().createRepository();
		// Faltaria las reglas de negocio
		// Faltaria la validacion de la pelicula por ejemplo
		repo.add(pelicula); // Ejemplo de uso del repositorio
	}
	
}
