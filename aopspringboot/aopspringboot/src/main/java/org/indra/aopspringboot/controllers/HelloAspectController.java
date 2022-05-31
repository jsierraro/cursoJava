package org.indra.aopspringboot.controllers;

import org.indra.aopspringboot.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloAspectController {
	
	@Autowired
	private HelloAspectService service;
	
	@GetMapping("/api/hello")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<String>(this.service.hello(),HttpStatus.OK);
	}
	
}
