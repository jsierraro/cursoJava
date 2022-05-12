package indra.utils;

import java.util.Scanner;

public class Consola {

public static String leerEntrada(String titulo) {
		
		System.out.println(titulo); 
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();
		
		while(nombre.isEmpty()){
			System.out.println("Por favor, ingresa un valor");
			nombre = teclado.nextLine();
		}
//		teclado.close();
		return nombre;
		
	}

	public static int leerNumero(String titulo) {
		
		System.out.println(titulo); 
		Scanner teclado = new Scanner(System.in);
		String numero = teclado.nextLine();
		
		while(numero.isEmpty() || !MetodosNumericos.esNumero(numero)){
			System.out.println("Por favor, ingresa un valor numérico");
			numero = teclado.nextLine();
		}
	//	teclado.close();
		return Integer.parseInt(numero);
	}
	
	public static int menuOperacionMatematica(int operacion, int n1, int n2) {
		switch (operacion) {

		case 1: {
			return n1 + n2;
		}
		case 2: {
			return n1 - n2;
		}
		case 3: {
			return n1 * n2;
		}
		case 4: {
			return n1 / n2;
		}
		default:
			return -1;

		}
	}

}
