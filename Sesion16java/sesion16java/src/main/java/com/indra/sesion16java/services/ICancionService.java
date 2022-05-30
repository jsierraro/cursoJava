package com.indra.sesion16java.services;

import java.util.List;

import org.springframework.stereotype.*;

import com.indra.sesion16java.models.*;

@Service
public interface ICancionService {
	public List<Cancion> getAll();
	public Cancion getById(int id) throws Exception;
	public Cancion add(Cancion cancion) throws Exception;
}
