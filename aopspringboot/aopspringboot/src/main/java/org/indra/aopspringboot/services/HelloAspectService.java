package org.indra.aopspringboot.services;

import org.springframework.stereotype.*;

@Service
public class HelloAspectService {

	public String hello() {
		return "Hola que tal";
	}
	
}
