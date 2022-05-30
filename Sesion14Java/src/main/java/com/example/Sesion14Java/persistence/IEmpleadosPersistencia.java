package com.example.Sesion14Java.persistence;

import java.util.*;

import com.example.Sesion14Java.models.*;

public interface IEmpleadosPersistencia {
	public List<Empleado> getAll();
	
	public Empleado getById(int id);
	
	public Empleado echoEmpleado(Empleado empleado);
	
	public void addEmpleado(Empleado empleado);
}
