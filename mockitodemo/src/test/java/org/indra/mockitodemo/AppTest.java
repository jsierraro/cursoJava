package org.indra.mockitodemo;


import org.indra.mockitodemo.models.ElHombreQueCalculaba;
import org.indra.mockitodemo.models.ICalculadora;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class AppTest 
{
	@Test
	public void testLista() {
		// configuramos el mock
		List<String> lista = (List<String>)mock(List.class);
		// la lista debe tenre 20 elementos
		when(lista.size()).thenReturn(20);
		
		// test
		int size = lista.size();
		assertEquals(20,size);
	}
	
	@Test
	public void testVerifiyMthodInvocation() {
		//configuro el mock
		List<String> lista = (List<String>)mock(List.class);
		lista.add("Hola");
		System.out.println(lista.size()); // <<<<< me va a dar cero por mucho que añada un elemento
		
		// Verifico que se haya llamado al add con el parametro hola
		Mockito.verify(lista).add("Hola");
	}
	
	@Test
	public void testHombreQueCalcula() {
		ICalculadora calculadora = mock(ICalculadora.class);
		when(calculadora.sumar(2, 3)).thenReturn(5);
		
		ElHombreQueCalculaba beremis = new ElHombreQueCalculaba(calculadora);
		int result = beremis.multiplicarSumando(2,3,2);
		assertEquals(10, result);
	}
}
