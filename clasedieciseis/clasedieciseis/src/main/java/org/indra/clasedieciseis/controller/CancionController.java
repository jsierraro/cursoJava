package org.indra.clasedieciseis.controller;

import java.util.*;

import org.indra.clasedieciseis.models.*;
import org.indra.clasedieciseis.repositories.*;
import org.indra.clasedieciseis.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class CancionController {

	@Autowired
	private ICancionService service;
	
	@GetMapping("/api/cancion")
	public ResponseEntity<List<Cancion>> getAll() {
		return new ResponseEntity<List<Cancion>>(this.service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/api/cancion/{id}")
	public ResponseEntity<Object> getById(@PathVariable(name="id") int id) {
		try {
			return new ResponseEntity<Object>(this.service.getById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/api/cancion")
	public ResponseEntity<Object> add (@RequestBody() Cancion cancion) {
		try {
			return new ResponseEntity<Object>(this.service.add(cancion), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/api/cancion/{id}")
	public ResponseEntity<Object> delete (@PathVariable(name="id") int id) {
		try {
			return new ResponseEntity<Object>(this.service.delete(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
