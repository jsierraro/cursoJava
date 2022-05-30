package org.indra.sesion15java.controllers;

import org.indra.sesion15java.dto.*;
import org.indra.sesion15java.models.*;
import org.indra.sesion15java.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class CancionController extends BaseController{
	
	@Autowired
	private ICancionService cancionService;
	
	@PostMapping("/api/cancion")
	public Object addCancion(@RequestBody Cancion cancion) {
		try {
			cancionService.add(cancion);
			return new Exito(cancion);
		} catch (ValidationException e) {
			return new ResponseError(e.getMessage());
		}
	}
}
