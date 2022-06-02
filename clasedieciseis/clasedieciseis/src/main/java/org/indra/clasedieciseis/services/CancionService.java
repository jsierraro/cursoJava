package org.indra.clasedieciseis.services;

import java.util.List;

import org.indra.clasedieciseis.models.*;
import org.indra.clasedieciseis.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class CancionService implements ICancionService {

	@Autowired
	private CancionRepository cancionRepository;

	@Override
	public List<Cancion> getAll() {
		return this.cancionRepository.findAll();
	}

	@Override
	public Cancion getById(int id) throws Exception {
		return this.cancionRepository.findById(id).get();
	}

	@Override
	public Cancion add(Cancion cancion) throws Exception {

		if ((cancion.getTitulo() == null) || (cancion.getTitulo().length() == 0))
			throw new Exception("Falta el titulo de la cancion");

		if ((cancion.getAutor() == null) || (cancion.getAutor().length() == 0))
			throw new Exception("Falta el autor de la cancion");

		if ((cancion.getDisco() == null) || (cancion.getDisco().length() == 0))
			throw new Exception("Falta el disco de la cancion");

		if (cancion.getSegundos() < 15)
			throw new Exception("La cancion no puede ocupar menos de 15 segundos");

		this.cancionRepository.save(cancion);

		return cancion;
	}

	@Override
	public Cancion delete(int id) throws Exception {
		Cancion c = this.cancionRepository.findById(id).get();
		this.cancionRepository.deleteById(id);
		return c;
	}

}
