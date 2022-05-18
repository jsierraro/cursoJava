package org.indra.main;

import java.time.LocalDate;

import org.indra.models.*;
import org.indra.repository.*;
import org.indra.services.PeliculaService;

public class Program {

	public static void main(String[] args) throws Exception {
		
		// Modo configuracion
		// Aqui se configura toda nuestra app y sus dependencias
		
		// Se define si se utilizara el mock repository o el db repository
		PeliculaRepositoryFactory.configureClass(PeliculaMockRepoFactory.class);
		//PeliculaRepositoryFactory.configureClass(PeliculaDbRepoFactory.class);
		
		
		// --------------------------------------------------------------------------
		// --------------------------------------------------------------------------
		// --------------------------------------------------------------------------
		
		
		// Modo ejecucion
		// Una vez que tengo todo configurado ejecuto mi aplicacion normalmente
//		IPeliculaRepository repo = PeliculaRepositoryFactory.getInstance().createRepository();
//		repo.add(new Pelicula()); // Ejemplo de uso del repositorio
		PeliculaService service = new PeliculaService();
		Pelicula p = new Pelicula();
		p.setNombre("El Señor de los Anillos");
		p.setDirector("Peter Jackson");
		p.setFecSalida(LocalDate.parse("2001-12-19"));
		p.setMinDUracion(280);
		service.Add(p);
	}

}
