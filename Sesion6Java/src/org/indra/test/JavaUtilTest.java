package org.indra.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class JavaUtilTest {

	@Test
	void testArrayList() {
		List<String> lista = new ArrayList<String>();
		lista.add("Esteban");
		lista.add("Carlos");
		lista.add("Irene");
		assertEquals(3,lista.size());
	}
	
	@Test
	void testLinkedList() {
		List<String> lista = new LinkedList<String>();
		lista.add("Esteban");
		lista.add("Carlos");
		lista.add("Irene");
		assertEquals(3,lista.size());
	}

	@Test
	void testQueue() {
		Queue<String> cola = new LinkedList<String>();
		cola.add("Uno");
		cola.add("Dos");
		cola.add("Tres");
		String elem = cola.remove();
		assertEquals("Uno",elem);
	}
	
	@Test
	void testStack() {
		Stack<String> pila = new Stack<String>();
		pila.add("Uno");
		pila.add("Dos");
		pila.add("Tres");
		String elem = pila.pop();
		assertEquals("Tres",elem);
	}
	
	@Test
	void testDictionary() {
		Dictionary<Integer,String> dict = new Hashtable<Integer,String>();
		dict.put(1,"Uno");
		dict.put(2,"Dos");
		dict.put(3,"Tres");
		String elem = dict.get(1);
		assertEquals("Uno",elem);
		elem = dict.get(2);
		assertEquals("Dos",elem);
		elem = dict.get(3);
		assertEquals("Tres",elem);
	}
	
	@Test
	void testSet() {
		Set<String> conjunto = new TreeSet<String>();
		conjunto.add("Uno");
		conjunto.add("Uno");
		conjunto.add("Uno");
		conjunto.add("Uno");
		conjunto.add("Uno");
		conjunto.add("Uno");
		conjunto.add("Dos");
		conjunto.add("Dos");
		conjunto.add("Tres");
		assertEquals(3,conjunto.size());
	}
	
	@Test
	void testDate() {
		Date fecha = new Date(2022,1,2);
		assertEquals(2022,fecha.getYear());
	}
	
	@Test
	void testCalendar() {
		Calendar fecha = new GregorianCalendar(2022,1,1);
		assertEquals(2022,fecha.get(Calendar.YEAR));
	}
	
	@Test
	void testUUID() {
		assertNotEquals(UUID.randomUUID(),UUID.randomUUID());
	}
	
	@Test
	void testRegex() {
		assertEquals(true,Pattern.matches("[0-9]*","1233343"));
		assertNotEquals(true,Pattern.matches("[0-9]*","1233343A"));
	}
}
