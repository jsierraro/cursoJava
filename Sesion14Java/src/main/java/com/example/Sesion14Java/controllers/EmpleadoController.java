package com.example.Sesion14Java.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.*;
import com.example.Sesion14Java.models.*;

@RestController
public class EmpleadoController {

	List<Empleado> empleados = new ArrayList<Empleado>();
	
	public EmpleadoController() {
		empleados.add(new Empleado(1,"Ernesto", "Martinez"));
		empleados.add(new Empleado(2,"Daniel", "Ledesma"));
		empleados.add(new Empleado(3,"Raquel", "Riello"));
		empleados.add(new Empleado(4,"Esteban", "Calabria"));
	}
	
	@GetMapping("/api/empleados")
	public List<Empleado> getAll(){
		return this.empleados;
	}
	
	@GetMapping("/api/empleados/{id}")
	public Empleado getById(@PathVariable("id") int id){
		return this.empleados.stream().filter(i -> i.getId()==id).findFirst().get();
	}
	
	@GetMapping("/api/empleados/echo")
	public Empleado echoEmpleado(Empleado empleado){
		return empleado;
	}
	
	@PostMapping("/api/empleados")
	public Empleado addEmpleado(@RequestBody Empleado empleado){
		empleado.setId(empleados.size()+1);
		return empleado;
	}
}
