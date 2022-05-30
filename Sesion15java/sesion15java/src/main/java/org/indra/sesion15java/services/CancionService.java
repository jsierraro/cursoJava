package org.indra.sesion15java.services;

import org.indra.sesion15java.models.Cancion;
import org.indra.sesion15java.models.ValidationException;
import org.springframework.stereotype.*;

@Service
public class CancionService implements ICancionService{

	@Override
	public void add(Cancion cancion) throws ValidationException {
		
		// simulo que la base de datos me genero un id
		cancion.setId(1);
		
		if (cancion.getNombre().length() < 3) {
			throw new ValidationException("Nombre no valido");
		}
		// Al final grabo en bbdd
	}

}
