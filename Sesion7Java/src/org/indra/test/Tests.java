package org.indra.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Stream;

import org.indra.methods.ContadorPalabras;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void testContar() {
		ContadorPalabras cont = new ContadorPalabras();
		cont.contarPalabras("Hola que tal tal tal estas");
		int contar = cont.getOcurrencias("tal");
		assertEquals(3,contar);
		contar = cont.getOcurrencias("que");
		assertEquals(1, contar);
		contar = cont.getOcurrencias("talghgh");
		assertEquals(0, contar);
	}

	@Test
	void testFilter() {
		List<String> lista = Arrays.asList(
		"Hola","que","tal","estas","javier"," ","yo","bien","y","tu","que","tal");
		// Para aplicar un filtro a la lista, por ejemplo los elementos que tengan mayor longitud
		int num = (int) lista.stream().filter(p -> p.length()>3).count();
		assertEquals(4,num);
	}
	
	@Test
	void testMayus() {
		List<String> lista = Arrays.asList(
		"Hola","que","tal");
		Stream<String> s = lista.stream();
		// Para hacer algo a cada elemento de la lista
		lista = s.map(m -> m.toUpperCase()).toList();
		assertEquals(Arrays.asList(
				"HOLA","QUE","TAL"),lista);
	}
	
	@Test
	void testSum() {
		List<Integer> lista = Arrays.asList(
		1,2,3,4,5);
		// Reducir el array en un solo elemento, en este caso en la suma de todos los elementos
		int sum = lista.stream().reduce(0, (acum,actual) -> acum+actual);
		assertEquals(15,sum);
	}
	
	@Test
	void testMatch() {
		List<String> lista = Arrays.asList(
		"Hola","que","tal", "Esteban");
		// Reducir el array en un solo elemento, en este caso en la suma de todos los elementos
		boolean contiene = lista.stream().anyMatch(p -> p.equals("Esteban"));
		assertEquals(true,contiene);
	}
	
	@Test
	@Order(1)
	void testWriteFile() throws IOException {
		File archivo = new File("nombres.txt");
		archivo.createNewFile();
		FileWriter writer = new FileWriter("nombres.txt");
		List<String> lista = Arrays.asList(
				"Esteban ","Jorge ","Adrian ");
		writer.write(lista.toString());
		writer.close();
		assertEquals(true,archivo.exists());
	}
	
	@Test
	@Order(2)
	void testReadFile() throws IOException {
		File archivo = new File("nombres.txt");
		long n = Files.lines(archivo.toPath()).filter(p -> p.length()>4).count();
		assertEquals(1, n);
	}

}
