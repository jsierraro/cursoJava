package org.indra.service;

import java.util.List;

import org.indra.model.Persona;
import org.indra.persistence.IPersonaRepository;
import org.indra.persistence.PersonaJdbRepository;

public class PersonaService implements IPersonaService{

	IPersonaRepository service = new PersonaJdbRepository();
	
	public void add(Persona persona) {
		service.add(persona);
	}

	@Override
	public List<Persona> getall() {
		// TODO Auto-generated method stub
		return null;
	}

}
