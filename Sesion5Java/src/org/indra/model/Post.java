package org.indra.model;

import java.util.*;

public class Post extends BusinessObject{

	private String contenido;
	private Usuario autor;
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	//private int likes;

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Usuario getAutor() {
		return autor;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void addComentario(Comentario comentario) {
		if(comentario != null) comentarios.add(comentario);
	}
	
}
