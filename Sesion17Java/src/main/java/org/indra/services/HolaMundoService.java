package org.indra.services;

public class HolaMundoService {

	public String demo() {
		return "Hola mundo";
	}

	public String demo2(int i) throws Exception {
		if( i > 10)
			throw new Exception("El par�metro no puede ser mayor a 10");
		return "M�todo demo2() ejecutado correctamente";
	}
}
