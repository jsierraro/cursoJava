package org.indra.services;

import org.indra.data.*;
import org.indra.dto.RegistroUsuarioDTO;
import org.indra.model.Usuario;

public class UsuarioService {
	
	private IUsuarioRepositorio repo;
	
	public UsuarioService(IUsuarioRepositorio repo) {
		this.repo = repo;
	}

	public Usuario registrarUsuarioNuevo(RegistroUsuarioDTO registro) throws Exception {
		String nombre= registro.getNombreDeseado();
		// Validar que el usuario no existe ya
		if(this.repo.buscarPorNombre(nombre)!= null)
			throw new Exception("Usuario ya existe");
		
		// Validar que el usuario no es nulo
		Usuario nuevo = new Usuario(nombre);
		nuevo.validar();
		
		// Insertar el usuario en la bbdd
		this.repo.add(nuevo);
		return nuevo;
	}

}
