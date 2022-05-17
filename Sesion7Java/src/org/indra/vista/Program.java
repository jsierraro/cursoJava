package org.indra.vista;

import java.util.*;
import java.util.function.Consumer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("Calculadora", "Espacio","Nota", "Garabato","Cielo");
		Consumer<String> metodoLambda = (n) -> {System.out.println("-- " + n + " --");};
		//lista.forEach(e -> System.out.println(e));
		//lista.forEach(metodoLambda);
		
		JButton but = new JButton("Haz click");
		but.setBounds(1, 1, 300, 50);
		but.setVisible(true);
		but.addActionListener((e) -> {
			//System.out.println("Haz click");
			JOptionPane.showConfirmDialog(but, "Hiciste click mauqina");
			});
		
		JFrame f = new JFrame();
		f.add(but);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(640, 480);
		f.setVisible(true);
	}

}
