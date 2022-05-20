package org.indra.services;

import java.util.List;

public interface IGeografiaService {

	List<String> getComunidadesAutonomas();
	List<String> getProvincias(String comunidadAutonoma);
}
