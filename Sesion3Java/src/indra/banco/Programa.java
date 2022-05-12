package indra.banco;

import java.time.LocalDate;
import java.util.*;
import indra.banco.models.*;


public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// EJERCICIO 4
			
			Banco banco = new Banco();
			// EJERCICIO 1
//			System.out.println("Ingrese su nombre");
//			String nombre = sc.nextLine();
//			System.out.println("Ingrese su apellido");
//			String apellido = sc.nextLine();
//			System.out.println("Ingrese su fecha de nacimiento (dd/mm/aaaa)");
//			LocalDate fecNacimiento = LocalDate.parse(sc.nextLine());
//			System.out.println(String.format("Nombre y apellidos: %s %s \nFecha de nacimiento: %f",nombre,apellido,fecNacimiento));
			
			// EJERCICIO 2
//			Cliente cliente = new Cliente();
//			System.out.println("Ingrese su nombre");
//			cliente.setNombre(sc.nextLine());
//			System.out.println("Ingrese su apellido");
//			cliente.setAPellido(sc.nextLine());
//			System.out.println("Ingrese su fecha de nacimiento (aaaa-mm-dd)");
//			cliente.setFecNacimiento(LocalDate.parse(sc.nextLine()));
//			System.out.println(cliente);
						
			// EJERCICIO 3
			System.out.println("Ingrese su nombre");
			String nombre = sc.nextLine();
			System.out.println("Ingrese su apellido");
			String apellido = sc.nextLine();
			System.out.println("Ingrese su fecha de nacimiento (aaaa-mm-dd)");
			LocalDate fecNacimiento = LocalDate.parse(sc.nextLine());
			
			Cliente cliente = new Cliente(nombre,apellido,fecNacimiento);
			banco.registrarClienteNuevo(cliente);
			
			Cuenta cuenta = banco.registrarCuentaNueva(cliente);
			cuenta.ingresar(1000);
			
			System.out.println(cliente);
			
		}
		catch (Exception e){
			System.err.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
