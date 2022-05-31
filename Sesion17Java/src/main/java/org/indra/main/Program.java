package org.indra.main;

import org.indra.services.*;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) throws Exception {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HolaMundoService service = (HolaMundoService) context.getBean("serviceProxy");
		String result =  service.demo2(100); //invocacion Servicio
//		String result =  service.demo();
		
		System.out.println(result);	
		context.close();
	}

}
