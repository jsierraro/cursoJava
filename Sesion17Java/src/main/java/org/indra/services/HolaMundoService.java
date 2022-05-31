package org.indra.services;

public class HolaMundoService {

	public String demo() {
		return "Hola mundo";
	}

	public String demo2(int i) throws Exception {
		if( i > 10)
			throw new Exception("El parámetro no puede ser mayor a 10");
		return "Método demo2() ejecutado correctamente";
	}
}
