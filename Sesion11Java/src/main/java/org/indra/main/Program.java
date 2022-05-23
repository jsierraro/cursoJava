package org.indra.main;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.indra.model.*;
import org.indra.service.*;

public class Program {

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);
		StandardServiceRegistry conf = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(conf).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
//		System.out.println("Ingrese nombre y apellido de la persona, uno por linea.");
//		Persona p = new Persona();
//		p.setNombre(sc.nextLine());
//		p.setApellido(sc.nextLine());
		IPersonaService service = new PersonaHibernateService(factory);
//		service.add(p);
		service.getall().stream().forEach(System.out::println);
		service.delete(7);
		service.getall().stream().forEach(System.out::println);
		factory.close();
	}

}
