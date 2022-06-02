package org.indra.proyectoJsierra.services;

import java.util.*;

import org.indra.proyectoJsierra.models.*;

public interface IEquipoService {

	public List<Equipo> getAll();
	public Equipo getById(int id);
	public Equipo add(Equipo equipo) throws Exception;
	public String delete(Equipo equipo) throws Exception;
	
}
