package com.example.Sesion14Java.controllers;

import java.util.*;

import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
public class HolaMundoController {

	@RequestMapping(value = "/api/holaMundo", method = RequestMethod.GET)
	public String miPrimeraAccion() {
		return "Hola mundo rest";
	}

	@RequestMapping(value = "/api/saludo/{nombre}", method = RequestMethod.GET)
	public String saludar(@PathVariable("nombre") String nombre) {
		return String.format("Hola %s, ¿que tal?", nombre);
	}

	@RequestMapping(value = "/api/saludoConQuery/{nombre}", method = RequestMethod.GET)
	public String saludarConQuery(@PathVariable("nombre") String nombre,
			@Nullable @RequestParam("apellido") String apellido) {
		if (apellido == null)
			apellido = "";
		return String.format("<h1> Hola %s %s, ¿que tal? </h1>", nombre, apellido);
	}

	@RequestMapping(value = "/api/sumar", method = RequestMethod.GET)
	// tambien se puede hacer @RequestParam(name="n1", required=false)
	public int sumar(@Nullable @RequestParam("n1") Integer a, @Nullable @RequestParam("n2") Integer b) {
		if (a == null || b == null)
			return 0;
		return a + b;
//		return String.format("La suma de $d y %d da el resultado %d",a,b,a+b);
	}

	@GetMapping("/api/saludo2")
	// @RequestMapping(value="/api/saludo2",method=RequestMethod.GET)
	public String otroSaludo(@RequestParam String nombre) {
		return String.format("Hola %s, ¿que hay de nuevo?", nombre);
	}

	@GetMapping("/api/saludoOpc")
	public String saludoOpc(@RequestParam Optional<String> nombre) {
		// return "Hola " + nombre.orElse("Sin nombre") + ",¿que hay de nuevo?";
		return "Hola " + nombre.orElseGet(() -> "Sin nombre") + ",¿que hay de nuevo?";
	}

	@GetMapping("/api/saludoDef")
	public String saludoDefault(@RequestParam(defaultValue = "PEPE") String nombre) {
		// return "Hola " + nombre.orElse("Sin nombre") + ",¿que hay de nuevo?";
		return String.format("<h1> Hola %s,¿que hay de nuevo?</h1>", nombre);
	}

	@GetMapping("/api/listaQuery")
	public String listarQueryString(@RequestParam(defaultValue = "{}") Map<String, String> query) {
		StringBuilder sb = new StringBuilder();
		sb.append("<ul>Mi lista de parametros es:<br>");
		query.keySet().forEach(key -> {
			sb.append("<li>" + key + ":" + query.get(key) + "</li><br>");
		});
		sb.append("</ul>");
		return sb.toString();
	}

	@GetMapping("/api/multParam")
	public String multiplesParametros(@RequestParam(name = "p") List<String> params) {
		// http://localhost:8080/api/multParam?p=1,2,3,4,5,6,7
		// http://localhost:8080/api/multParam?p=a&p=b&p=c&p=d&p=e&p=f
		StringBuilder sb = new StringBuilder();
		sb.append("<ol>");
		params.forEach(param -> sb.append("<li>" + param + "</li>"));
		sb.append("</ol>");
		return sb.toString();
	}
}
