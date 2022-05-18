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
		service.add(p);
		
		assertEquals("El Señor de los Anillos",p.getNombre());
		assertEquals("Peter Jackson",p.getDirector());
		assertEquals(LocalDate.parse("2001-12-19"),p.getFecSalida());
		assertEquals(280,p.getMinDUracion());
	}
	
	@Test
	void testUpdatePelicula() throws Exception {
		PeliculaService service = new PeliculaService();
		Pelicula p = service.getByName("La momia");
		assertEquals("La momia",p.getNombre());
		assertEquals("Sam Reimi",p.getDirector());
		assertEquals(LocalDate.parse("1999-08-12"),p.getFecSalida());
		assertEquals(160,p.getMinDUracion());
		//service.getAll().stream().map(e -> e.getNombre()).forEach(pi -> System.out.println(pi));
		p.setNombre("El Señor de los Anillos: La Comunidad del Anillo");
		p.setDirector("Peter Jackson");
		p.setFecSalida(LocalDate.parse("2001-12-19"));
		p.setMinDUracion(280);
		service.update(p);
		//System.out.println();
		//service.getAll().stream().map(e -> e.getNombre()).forEach(pi -> System.out.println(pi));
		assertEquals("El Señor de los Anillos: La Comunidad del Anillo",p.getNombre());
		assertEquals("Peter Jackson",p.getDirector());
		assertEquals(LocalDate.parse("2001-12-19"),p.getFecSalida());
		assertEquals(280,p.getMinDUracion());
	}
	
	@Test
	void testDeletePelicula() throws Exception {
		PeliculaService service = new PeliculaService();
		Pelicula p = service.getByName("La momia");
		//System.out.println();
		//service.getAll().stream().map(e -> e.getNombre()).forEach(pi -> System.out.println(pi));
		long numero = service.getAll().stream().filter(p2 -> p2.getNombre() == p.getNombre()).count();	
		//System.out.println();
		service.delete(p.getId());
		//service.getAll().stream().map(e -> e.getNombre()).forEach(pi -> System.out.println(pi));

		long numero2 = service.getAll().stream().filter(p2 -> p2.getNombre() == p.getNombre()).count();	
		assertNotEquals(numero,numero2);
	}

}
