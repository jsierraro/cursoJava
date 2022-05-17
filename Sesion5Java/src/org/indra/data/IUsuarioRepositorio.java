package org.indra.data;

import java.util.*;

import org.indra.model.*;

public interface IUsuarioRepositorio {

	public Usuario buscarPorNombre(String nombre);
	public List<Usuario> buscarTodos();
	public void add(Usuario usuario);
	//...
}
