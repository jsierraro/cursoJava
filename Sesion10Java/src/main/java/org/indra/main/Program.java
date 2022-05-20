package org.indra.main;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

import org.indra.services.IGeografiaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) throws IOException {

//		File arch = new File("text.txt");
//		FileWriter fw = new FileWriter(arch);
//		fw.write("Hola Mundo");
//		fw.close();
//		Scanner reader = new Scanner(arch);
//		System.out.println(reader.nextLine());
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		IGeografiaService geografiaService = (IGeografiaService) context.getBean("geografiaService");
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		IGeografiaService geografiaService = context.getBean(IGeografiaService.class);
		
		geografiaService.getComunidadesAutonomas().stream().forEach(System.out::println);
		geografiaService.getComunidadesAutonomas().stream()
				.forEach(e -> {
					System.out.println(String.format("\nProvincias de %s:",e));
					geografiaService.getProvincias(e).stream().forEach(System.out::println);
					});
		
		context.registerShutdownHook();
	}

}
