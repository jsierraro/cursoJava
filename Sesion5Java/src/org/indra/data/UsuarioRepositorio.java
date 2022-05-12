package org.indra.data;

import java.util.*;

import org.indra.model.Usuario;

public class UsuarioRepositorio {

	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Usuario buscarPorNombre (String nombre) {
		for (Usuario e : usuarios)
			if(e.getNombre().equals(nombre))
				return e;
		return null;
	}
	public void add (Usuario usuario) {
		this.usuarios.add(usuario);
	}
}
