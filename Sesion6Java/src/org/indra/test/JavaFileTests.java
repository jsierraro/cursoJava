package org.indra.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.util.*;

import org.junit.jupiter.api.Test;

class JavaFileTests {

	@Test
	void testNewFile() throws IOException {
		File archivo = new File("file.txt");
		archivo.createNewFile();
		assertEquals(true,archivo.exists());
	}
	
	@Test
	void testWriteFile() throws IOException {
		FileWriter writer = new FileWriter("file.txt");
		String escrito = "Este es un texto";
		writer.write(escrito);
		writer.close();
		
		File archivo = new File("file.txt");
		Scanner reader = new Scanner(archivo);
		String linea = "";
		if(reader.hasNextLine()) {
			linea = reader.nextLine();
		}
		
		assertEquals(escrito,linea);
		
		reader.close();
	}

}
