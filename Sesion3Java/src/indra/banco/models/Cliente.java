package indra.banco.models;

import java.time.LocalDate;
//import java.util.*;

public class Cliente {

	private String nombre;
	private String apellido;
	private LocalDate fecNacimiento;
	
	public Cliente(String nombre, String apellido, LocalDate fecNacimiento) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.fecNacimiento=fecNacimiento;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
//	public void setNombre(String nombre) {
//		this.nombre=nombre;
//	}
	
	public String getApellido() {
		return this.apellido;
	}
	
//	public void setApellido(String apellido) {
//		this.apellido=apellido;
//	}
//	
	public LocalDate getFecNacimiento() {
		return this.fecNacimiento;
	}
	
//	public void setFecNacimiento(LocalDate fecNacimiento) {
//		this.fecNacimiento=fecNacimiento;
//	}
	
	@Override
	public String toString() {
		return String.format("Hola soy %s %s y nací el %s", nombre,apellido,fecNacimiento);
	}
}
