package org.indra.main;

import java.time.*;

import org.indra.models.*;
import org.indra.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		// EJemplo 1 sin spring
//		PeliculaService service = new PeliculaService(); // Esto se podria crear con un factory
//		service.addPelicula(new Pelicula() {
//			{
//				setTitulo("Super 8");
//				setFecha(LocalDate.of(2011, Month.JULY, 1));
//			}
//		});
		
		// EJemplo 2 con spring
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.memoryRepository.test.xml");
		IPeliculaService service = (IPeliculaService) context.getBean("peliculaService"); // Esto se podria crear con un factory
		service.add(new Pelicula() {
			{
				setTitulo("Super 8");
				setFecha(LocalDate.of(2011, Month.JULY, 1));
			}
		});
		context.close();
	}

}
