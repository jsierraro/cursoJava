package org.indra.proyectoJsierra.services;

import java.util.*;

import org.indra.proyectoJsierra.models.*;
import org.indra.proyectoJsierra.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class EquipoService implements IEquipoService{

	@Autowired
	private EquipoRepository repository;
	
	@Override
	public List<Equipo> getAll() {
		return this.repository.findAll();
	}

	@Override
	public Equipo getById(int id) {
		return this.repository.findById(id).get();
	}

	@Override
	public Equipo add(Equipo equipo) throws Exception {
		List<Equipo> todos = this.repository.findAll();
		int ultimo;
		if(!todos.isEmpty() && todos!=null) 
			ultimo = todos.stream().mapToInt(e -> e.getPosicion()).max().getAsInt();
		else
			ultimo = 1;
		if(equipo.getNombre()!=null && equipo.getNombre().length() < 3)
			throw new EquipoValidacionExcepcion("El nombre del equipo debe tener más de 3 caracteres");
		if(equipo.getCapitan()!=null && equipo.getEntrenador()!=null && equipo.getCapitan().equals(equipo.getEntrenador()))
			throw new EquipoValidacionExcepcion("El entrenador y el capitán del equipo deben estar valorizados y no pueden ser la misma persona");
		if(equipo.getPosicion() < ultimo)
			throw new EquipoValidacionExcepcion("Los equipos de nuevo ingreso deben empezar en la última posición");
		return this.repository.save(equipo);
	}

	@Override
	public String delete(Equipo equipo ) throws Exception {
		try{
			this.repository.delete(equipo);
		}catch (IllegalArgumentException e){
			throw new EquipoValidacionExcepcion("El equipo a borrar no puede ser nulo");
		}
		return "Equipo eliminado correctamente";
	}

}
