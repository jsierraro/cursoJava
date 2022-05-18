package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.indra.models.*;
import org.indra.repository.*;
import org.indra.services.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeliculaTest {

	@BeforeEach
	void setUp() throws Exception {
		PeliculaRepositoryFactory.configureClass(PeliculaMockRepoFactory.class);
		//PeliculaRepositoryFactory.configureClass(PeliculaDbRepoFactory.class);
	}

	@Test
	void testAddPelicula() throws Exception {
		PeliculaService service = new PeliculaService();
		Pelicula p = new Pelicula();
		p.setNombre("El Señor de los Anillos");
		p.setDirector("Peter Jackson");
		p.setFecSalida(LocalDate.parse("2001-12-19"));
		p.setMinDUracion(280);
		service.Add(p);
		
		Pelicula busqueda = PeliculaRepositoryFactory.getInstance().createRepository().findByName("El Señor de los Anillos");
		
	}

}
