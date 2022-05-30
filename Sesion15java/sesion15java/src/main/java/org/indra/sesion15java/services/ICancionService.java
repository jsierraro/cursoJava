package org.indra.sesion15java.services;

import org.indra.sesion15java.models.*;

public interface ICancionService {

	public void add(Cancion cancion) throws ValidationException;
}
