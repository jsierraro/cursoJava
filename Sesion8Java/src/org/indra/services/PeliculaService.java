package org.indra.services;

import java.util.List;

import org.indra.models.*;
import org.indra.repository.IPeliculaRepository;
import org.indra.repository.PeliculaRepositoryFactory;

public class PeliculaService {

	IPeliculaRepository repo;

	public IPeliculaRepository getRepo() {
		return repo;
	}

	public PeliculaService() throws Exception {
		super();
		this.repo = PeliculaRepositoryFactory.getInstance().createRepository();
	}

	public void add(Pelicula pelicula) throws Exception {
		// Faltaria las reglas de negocio
		// Faltaria la validacion de la pelicula por ejemplo
		repo.add(pelicula); // Ejemplo de uso del repositorio
	}
	
	public void update(Pelicula pelicula) throws Exception {
		// Faltaria las reglas de negocio
		// Faltaria la validacion de la pelicula por ejemplo
		repo.update(pelicula); // Ejemplo de uso del repositorio
	}
	
	public void delete(int id) throws Exception {
		// Faltaria las reglas de negocio
		// Faltaria la validacion de la pelicula por ejemplo
		repo.delete(id); // Ejemplo de uso del repositorio
	}

	public List<Pelicula> getAll() throws Exception {
		// Faltaria las reglas de negocio
		// Faltaria la validacion de la pelicula por ejemplo
		return repo.findAll(); // Ejemplo de uso del repositorio
	}
	
	public Pelicula getByName(String name) throws Exception {
		return repo.findByName(name);
	}
	
	public Pelicula getById(int id) throws Exception {
		return repo.findById(id);
	}
}
