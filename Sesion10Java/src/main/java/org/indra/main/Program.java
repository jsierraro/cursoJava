package org.indra.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		File arch = new File("text.txt");
		FileWriter fw = new FileWriter(arch);
		fw.write("Hola Mundo");
		fw.close();
		Scanner reader = new Scanner(arch);
		System.out.println(reader.nextLine());
		
	}

}
