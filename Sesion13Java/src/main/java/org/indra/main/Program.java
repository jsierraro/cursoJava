package org.indra.main;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.indra.models.*;
import org.indra.services.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		System.out.println("Bienvenidos");

		// Configuracion de hibernate, con mapeo xml
//		Configuration conf = new Configuration();
//		conf.configure("hibernate.cfg.xml");
//		SessionFactory sf = conf.buildSessionFactory();
//		ServiceBase.configureSF(sf);

		// configuracion hibernate con anotaciones
		SessionFactory sf = new AnnotationConfiguration().configure.addPackage("org.indra.models")
				.addAnotatedClass(Libro.class).buildSessionFactory();
		ServiceBase.configureSF(sf);

		// configuracion de spring
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ILibroService service = (ILibroService) context.getBean("libroService");

		// ILibroService service = new LibroService(); // Lo vamos a reemplazar por
		// inyeccion de dependencias

		Libro pilares = new Libro();
		pilares.setTitulo("Los pilares de la tierra 3");
		pilares.setEscritor("Ken Follet");

		service.add(pilares);

		System.out.println("Libro salvado en base de datos: " + pilares);
	}

}
