package org.indra.clasedieciseis.services;

import java.util.*;

import org.indra.clasedieciseis.models.*;


public interface ICancionService {
	
	public List<Cancion> getAll();
	public Cancion getById(int id) throws Exception;
	public Cancion add(Cancion cancion) throws Exception;
	public Cancion delete(int id) throws Exception;
}
