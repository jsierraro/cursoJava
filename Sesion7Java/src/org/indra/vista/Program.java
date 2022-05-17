package org.indra.vista;

import java.awt.desktop.SystemSleepEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

import javax.swing.*;

import org.indra.models.*;

public class Program {

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("Calculadora", "Espacio","Nota", "Garabato","Cielo");
		Consumer<String> metodoLambda = (n) -> {System.out.println("-- " + n + " --");};
		//lista.forEach(e -> System.out.println(e));
		//lista.forEach(metodoLambda);
		
		JButton but = new JButton("Haz click");
		but.setBounds(1, 1, 300, 50);
		but.addActionListener((e) -> {
			//System.out.println("Haz click");
			JOptionPane.showConfirmDialog(but, "Hiciste click mauqina");
			});
		
		JFrame f = new JFrame();
		f.add(but);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(640, 480);
		//f.setVisible(true);
		
		Animal garfield = new Gato();
		//garfield.mostrar((a) -> {System.out.println("Soy un animal que hace" + a.getSonido());});
		
		IDibujador porConsola = (Animal a) -> {System.out.println("Soy un " + a.getClass().getSimpleName() + " que hace " + a.getSonido());};
//		try {
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Inserta el animal que quieres crear");
//			String animal = sc.nextLine();
//			Class creador = Class.forName("org.indra.models."+animal);
//			Animal a = (Animal) creador.newInstance();
//			a.mostrar(porConsola);
//		} catch (ClassNotFoundException e1) {
//			System.err.println("No existe el animal especificado");
//		} catch (InstantiationException e1) {
//			e1.printStackTrace();
//		} catch (IllegalAccessException e1) {
//			e1.printStackTrace();
//		} finally {}
//		Animal pluto = new Perro();
//		pluto.mostrar(porConsola);
//		garfield.mostrar(porConsola);
		
//		List<String> l = Arrays.asList("a","b","c","d");
//		l.forEach(System.out::println); //l.forEach(a -> System.out.println(a));
		
		//Listar los metodos por reflection
//		ArrayList<String> l = new ArrayList<String>();
//		Class claseArrayList = lista.getClass();
//		Stream<Method> metodos = Arrays.stream(claseArrayList.getMethods());
//		metodos.forEach(m->System.out.println(m.getName()));
//		List<String> s = Arrays.asList("Hola", "que", "tal");
//		Class claseArrayList = s.getClass();
		String s = "que";
		Class claseString = s.getClass();
		Stream<Method> metodos = Arrays.stream(claseString.getMethods());
		//metodos.forEach(m->System.out.println(m.getName()));
//		Method metodoLength = metodos.filter(m -> m.getName().equals("length")).findFirst().get();
		Method metodoContains = metodos.filter(m -> m.getName().equals("contains")).findFirst().get();

		try {
			boolean t = (Boolean) metodoContains.invoke(s,"q");
			System.out.println(t);
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		}
	}

}
