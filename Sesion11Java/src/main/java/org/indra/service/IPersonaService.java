package org.indra.service;

import java.util.*;

import org.indra.model.*;

public interface IPersonaService {

	public void add(Persona persona);
	public List<Persona> getall();
	public void delete(int id);
}
