package org.indra.repository;

import java.time.LocalDate;
import java.util.*;

import org.indra.models.Pelicula;

public class PeliculaMockRepository implements IPeliculaRepository{

	private List<Pelicula> peliculas = new ArrayList<Pelicula>();
	
	public PeliculaMockRepository() throws Exception {
		this.add(new Pelicula("La momia", LocalDate.parse("1999-08-12"),"Sam Reimi",160));
		this.add(new Pelicula("La momia", LocalDate.parse("1999-08-12"),"Sam Reimi",160));
		this.add(new Pelicula("Doctor Strange", LocalDate.parse("2022-05-06"),"Sam Reimi",200));
		this.add(new Pelicula("Avatar", LocalDate.parse("2009-12-20"),"James Cameron",230));
	}
	
	@Override
	public List<Pelicula> findAll() throws Exception {
		// TODO Auto-generated method stub
		return this.peliculas;
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
		Pelicula modi = findById(objeto.getId());
		modi.setNombre(objeto.getNombre());
		modi.setFecSalida(objeto.getFecSalida());
		modi.setDirector(objeto.getDirector());
		modi.setMinDUracion(objeto.getMinDUracion());
	}

}
