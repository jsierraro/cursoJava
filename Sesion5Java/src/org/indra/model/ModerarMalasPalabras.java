package org.indra.model;

public class ModerarMalasPalabras implements IEstrategiaModeracion{

	@Override
	public boolean esAPropiado(String texto) {
		String[] malasPalabras = {"tonto","incapaz","feo","malo"};
		for(String palabra : malasPalabras) {
			if(texto.contains(palabra)) return true;
		}
		return false;
	}
	
}
