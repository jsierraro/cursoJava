package org.indra.model;

public class Comentario extends BusinessObject{

	private String texto;
	private Usuario autor;
	private boolean inapropiado = false;
	private IEstrategiaModeracion moderador;

	public Comentario(String texto, Usuario autor) {
		super();
		this.texto = texto;
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public Usuario getAutor() {
		return autor;
	}
	
	void setEstrategiaModeracion(IEstrategiaModeracion estrategia) {
		this.moderador = estrategia;
	}
	
	void moderar() {
		if(!this.moderador.equals(null))
			inapropiado = !this.moderador.esAPropiado(this.texto);
	}
}
