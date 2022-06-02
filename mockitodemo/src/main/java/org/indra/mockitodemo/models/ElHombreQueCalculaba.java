package org.indra.mockitodemo.models;

public class ElHombreQueCalculaba {

	private ICalculadora calculadora;

	public ElHombreQueCalculaba(ICalculadora calculadora) {
		this.calculadora = calculadora;
	}

	public int multiplicarSumando(int a, int b, int veces) {
		int res = 0;
		for(int i=1; i< veces; i++)
			res += calculadora.sumar(a, b);
		return res;
	}
	
}
