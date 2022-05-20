package org.indra.repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import org.indra.models.*;

public class PeliculaMemoRepository implements IPeliculaRepository{

	private List<Pelicula> peliculas=new ArrayList<Pelicula>();
	@Override
	public void add(Pelicula pelicula) {
		this.peliculas.add(pelicula);
		pelicula.setId( peliculas.stream().mapToInt(p->p.getId()).max().getAsInt()+1);
	}

	@Override
	public Pelicula findById(int id) {
		return this.peliculas.stream().filter(p -> p.getId()==id).findFirst().get();
	}

	@Override
	public Pelicula findByName(String name) {
		return this.peliculas.stream().filter(p -> p.getTitulo()==name).findFirst().get();
	}

}
