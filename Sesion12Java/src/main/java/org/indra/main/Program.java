package org.indra.main;

public class Program {

	public static void main(String[] args) {

		Automovil auto = new Automovil("Lamborghini","Murcielago");
		auto.setId(1);
//		auto.setMarca("Lamborghini");
//		auto.setModelo("Murcielago");
		auto.setKilometros(0);
		System.out.println(auto);
		
		Reloj reloj = Reloj.builder().Marca("Casio").Modelo("XCR45").build();
		System.out.println(reloj);
		reloj.Salvar();
		
		Persona per = new Persona("Juan","Perez");
		System.out.println(per);
	}

}
