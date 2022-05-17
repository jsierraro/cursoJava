package org.indra.ejTest;

import java.util.Dictionary;
import java.util.*;

public class ContadorPalabras {

	private Dictionary<String, Integer> palabras = new Hashtable<String, Integer>();
	
	public void contarPalabras(String texto) {
		String[] split = texto.split(" ");
		for(String p : split) {
			palabras.put(p, getOcurrencias(p) + 1);
		}
	}
	
	public int getOcurrencias(String palabra) {
		Integer res = palabras.get(palabra);
		if(res != null)
			return res;
		else
			return 0;
	}
}
