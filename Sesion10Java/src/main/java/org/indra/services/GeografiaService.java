package org.indra.services;

import java.util.*;

public class GeografiaService implements IGeografiaService{
	
	private List<String> comunidadesAutonomas;
	private Map<String,List<String>> provincias;

	public List<String> getComunidadesAutonomas() {
		return this.comunidadesAutonomas;
	}

	public void setComunidadesAutonomas(List<String> comunidadesAutonomas) {
		this.comunidadesAutonomas = comunidadesAutonomas;
	}

	public Map<String,List<String>> getProvincias() {
		return provincias;
	}

	public void setProvincias(Map<String,List<String>> provincias) {
		this.provincias = provincias;
	}
	
	public List<String> getProvincias(String comunidad){
		return this.provincias.get(comunidad);
	}
	
}
