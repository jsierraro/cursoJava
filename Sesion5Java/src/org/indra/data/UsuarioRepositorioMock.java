package org.indra.data;

import java.util.*;

import org.indra.model.Usuario;

public class UsuarioRepositorioMock implements IUsuarioRepositorio{

	List<Usuario> usuarios = new ArrayList<Usuario>() {{
		new Usuario("Alice");
		new Usuario("Bob");
		new Usuario("Charles");
	}};
	
	public Usuario buscarPorNombre (String nombre) {
		for (Usuario e : usuarios)
			if(e.getNombre().equals(nombre))
				return e;
		return null;
	}
	public void add (Usuario usuario) {
		this.usuarios.add(usuario);
	}
	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		return this.usuarios;
	}
}
