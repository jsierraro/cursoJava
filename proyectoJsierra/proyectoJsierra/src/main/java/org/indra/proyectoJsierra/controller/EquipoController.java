package org.indra.proyectoJsierra.controller;

import java.util.List;

import org.indra.proyectoJsierra.models.*;
import org.indra.proyectoJsierra.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class EquipoController {

	@Autowired
	private IEquipoService service;
	
	@GetMapping("/api/equipo")
	public ResponseEntity<List<Equipo>> getAll(){
		return new ResponseEntity<List<Equipo>>(this.service.getAll(),HttpStatus.OK);
	}
	
	@GetMapping("/api/equipo/{id}")
	public ResponseEntity<Object> getById(@PathVariable(name="id") int id){
		try {
			return new ResponseEntity<Object>(this.service.getById(id),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/api/equipo")
	public ResponseEntity<Object> add(@RequestBody Equipo equipo){
		try {
			return new ResponseEntity<Object>(this.service.add(equipo),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/api/equipo/{id}")
	public ResponseEntity<Object> delete(@PathVariable(name="id") int id){
		try {
			Equipo equipo = this.service.getById(id);
			try {
				return new ResponseEntity<Object>(this.service.delete(equipo),HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<Object>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
}
