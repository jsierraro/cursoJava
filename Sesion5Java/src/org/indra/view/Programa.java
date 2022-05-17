package org.indra.view;

import java.util.List;

import org.indra.data.*;
import org.indra.dto.*;
import org.indra.model.Usuario;
import org.indra.services.*;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a Indragram\n");

		// PARTE 1: sin base de datos
		
//		UsuarioRepositorioMock repo = new UsuarioRepositorioMock();
//		UsuarioService usuarioService = new UsuarioService(repo);
//		System.out.println("Probamos a registrar un usuario nuevo");
//		RegistroUsuarioDTO registro = new RegistroUsuarioDTO();
//		registro.setNombreDeseado("Juan");
//
//		try {	
//			usuarioService.registrarUsuarioNuevo(registro);
//		} catch (Exception e) {
//			System.err.println("Esto no deberia pasar.");
//		}
//
//		System.out.println(String.format("Usuario \"%s\" registrado satisfactoriamente\n",registro.getNombreDeseado()));
//
//		System.out.println(String.format("Voy a probar a registrar un usuario ya registrado, %s",registro.getNombreDeseado()));
//		RegistroUsuarioDTO dupli = new RegistroUsuarioDTO();
//		dupli.setNombreDeseado("Juan");
//
//		try {
//			usuarioService.registrarUsuarioNuevo(dupli);
//		} catch (Exception e) {
//			System.out.println("Deberia dar un error de usuario duplicado");
//			System.err.println(e.getMessage());
//		}
//
//		System.out.println("\nVoy a probar a registrar un usuario sin nombre");
//		RegistroUsuarioDTO vacio = new RegistroUsuarioDTO();
//		vacio.setNombreDeseado("");
//
//		try {
//			usuarioService.registrarUsuarioNuevo(vacio);
//		} catch (Exception e) {
//			System.out.println("Deberia dar un error de nombre vacio");
//			System.err.println(e.getMessage());
//
//		}
		
		// Parte 2: con base de datos
		
		IUsuarioRepositorio repo = new UsuarioRepositorioDB();
		List<Usuario> todos = repo.buscarTodos();
		todos.forEach( usr -> System.out.println(usr.getNombre()));
		Usuario u = repo.buscarPorNombre("Daniel");
		System.out.println("\n"+u.getNombre()+"\n");
		repo.add(new Usuario("Manuel"));
		todos = repo.buscarTodos();
		todos.forEach( usr -> System.out.println(usr.getNombre()));

	}

}
