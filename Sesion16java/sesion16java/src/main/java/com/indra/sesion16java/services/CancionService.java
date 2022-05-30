package com.indra.sesion16java.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.indra.sesion16java.models.*;
import com.indra.sesion16java.repository.*;

@Service
public class CancionService implements ICancionService{

	@Autowired
	private CancionRepository repository;
	
	@Override
	public List<Cancion> getAll() {
		return this.repository.findAll();
	}

	@Override
	public Cancion getById(int id) throws Exception {
		return this.repository.findById(id).get();
	}
	
	@Override
	public Cancion add(Cancion cancion) throws Exception {
		if(cancion.getTitulo()== null || cancion.getTitulo().length() == 0)
			throw new Exception("Falta el titulo de la cancion");
		if(cancion.getAutor()== null || cancion.getAutor().length() == 0)
			throw new Exception("Falta el autor de la cancion");
		if(cancion.getDisco()== null || cancion.getDisco().length() == 0)
			throw new Exception("Falta el disco de la cancion");
		if(cancion.getSegundos() < 15)
			throw new Exception("La cancion es demasiado corta");
		return this.repository.save(cancion);
	}

}
