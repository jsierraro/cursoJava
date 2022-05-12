package indra.cursojava.clasedos;

import java.util.*;
import indra.utils.*;

public class ClaseDos {

	public static void main(String[] args) {

		// EJERCICIO 1

//		String nombre = Consola.leerEntrada("Bienvenidos a la segunda clase, ¿cuál es tu nombre?");
//
//		int edad = Consola.leerNumero(String.format("Bienvenido %s, ¿cuántos años tienes?", nombre));
//		
//		System.out.println(String.format("Tienes %s años",edad));
//		
//		System.out.println(String.format("Este es un valor al azar %d",MetodosNumericos.valorAlAzar(0,9)));

		// EJERCICIO 2

//		int num1 = Consola.leerNumero(String.format("Ingresa un numero"));
//		int num2 = Consola.leerNumero(String.format("Ingresa otro numero"));
//		System.out.println("Seleccione una opcion: ");
//		System.out.println("1 - Sumar los numeros ");
//		System.out.println("2 - Restar los numeros ");
//		System.out.println("3 - Multiplicar los numeros ");
//		System.out.println("4 - Dividir los numeros ");
//		int ope = Consola.leerNumero("");
//		// System.out.println(Consola.menuOperacionMatematica(ope,num1,num2));
//		System.out.println(switch (ope) {
//		case 1 -> num1 + num2;
//		case 2 -> num1 - num2;
//		case 3 -> num1 * num2;
//		case 4 -> num1 / num2;
//		default -> -1;
//		});

		// EJERCICIO 3
		
//		String[] nombres = new String[]{"Juan","Alberto","Carlos","sergio"};
//		for( String e : nombres) 
//			System.out.println(e);
		
		// EJERCICIO 4
		
//		System.out.println();
//		int numero = Consola.leerNumero(String.format("Bienvenido, ¿cuántos números quieres?"));
//		int[] lista = new int[numero];
//		for(int i=0; i < numero; i++) {
//			lista[i]=Consola.leerNumero(String.format("Elija cual será el número en la posicion %d:",i));
//		}
//		int max = lista[0];
//		int min = lista[0];
//		double acum = 0.0;
//		for(int i = 0; i < numero; i++) {
//			if(max<lista[i])
//				max=lista[i];
//			if(min > lista[i])
//				min=lista[i];
//			acum+=lista[i];
//		}
//		System.out.println(String.format("Max: %d , Min: %d , Avg: %f",max,min,acum/numero));
		
		// EJERCICIO 6
//		
//		ArrayList<String> lista = new ArrayList<String>();
//		System.out.println("Se le va a pedir una lista de nombres; introduzca \" FIN \" al terminar.");
//		String nombre = Consola.leerEntrada("Introduzca un nombre: ");
//		while(!nombre.equals("FIN")) {
//			lista.add(nombre);
//			nombre = Consola.leerEntrada("Introduzca un nombre: ");
//		}
//		for( String elem : lista) {
//			String inv = new StringBuilder(elem).reverse().toString();
//			System.out.println(String.format("Nombre: %s, Longitud: %d, Invertido: %s",elem,elem.length(),inv));
//		}
		
//		ArrayList<String> lista = new ArrayList<String>();
//		System.out.println("Se le va a pedir una lista de nombres; introduzca \" FIN \" al terminar.");
//		String nombre = Consola.leerEntrada("Introduzca un nombre: ");
//		while(!nombre.equals("FIN")) {
//			lista.add(nombre);
//			nombre = Consola.leerEntrada("Introduzca un nombre: ");
//		}
//		lista.forEach(elem ->{
//			String inv = new StringBuilder(elem).reverse().toString();
//			System.out.println(String.format("Nombre: %s, Longitud: %d, Invertido: %s",elem,elem.length(),inv));
//		});
		
		// EJERCICIO 7
		
//		StringBuilder builder = new StringBuilder();
//		builder.append("String 1");
//		builder.append("String 2");
//		builder.append("String 3");
//		System.out.println(builder);

	}

}
