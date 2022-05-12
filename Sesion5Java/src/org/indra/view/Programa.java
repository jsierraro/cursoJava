package org.indra.view;

import org.indra.dto.*;
import org.indra.services.*;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a Indragram");

		UsuarioService usuarioService = new UsuarioService();
		System.out.println("Probamos a registrar un usuario nuevo");
		RegistroUsuarioDTO registro = new RegistroUsuarioDTO();
		registro.setNombreDeseado("Juan");

		try {
			usuarioService.registrarUsuarioNuevo(registro);
		} catch (Exception e) {
			System.err.println("Esto no deberia pasar.");
		}

		System.out.println("Usuario registrado satisfactoriamente\n");

		System.out.println("Voy a probar a registrar un usuario ya registrado");
		RegistroUsuarioDTO dupli = new RegistroUsuarioDTO();
		dupli.setNombreDeseado("Juan");

		try {
			usuarioService.registrarUsuarioNuevo(dupli);
		} catch (Exception e) {
			System.out.println("DEberia dar un error de usuario duplicado");
			System.out.println(e.getMessage());
		}

		System.out.println("\nVoy a probar a registrar un usuario sin nombre");
		RegistroUsuarioDTO vacio = new RegistroUsuarioDTO();
		vacio.setNombreDeseado("");

		try {
			usuarioService.registrarUsuarioNuevo(vacio);
		} catch (Exception e) {
			System.out.println("DEberia dar un error de nombre vacio");
			System.out.println(e.getMessage());

		}
	}

}
