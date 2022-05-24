package org.indra.main;

import java.io.FileWriter;

import lombok.*;

@Builder
@ToString
public class Reloj {

	private @NonNull String Marca;
	private @NonNull String Modelo;

	@SneakyThrows
	public void Salvar() {
		@Cleanup FileWriter wr = new FileWriter("reloj.txt");
		wr.write(this.toString());
//		wr.close();
	}
	
}
