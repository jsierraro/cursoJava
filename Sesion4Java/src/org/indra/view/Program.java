package org.indra.view;

import org.indra.model.*;

public class Program {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la clase 4 - Ejemplo de composite y polimorfismo");
		
		// PARTE 1 - Sin interfaces
		
//		EntidadSistemaFicheros carpetaRaiz = new Carpeta ("root"); ---> lo comentamos para 
//		EntidadSistemaFicheros carpetaTemp = new Carpeta ("temp"); ---> poder acceder al metodo addHijo
		
//		System.out.println("Creando carpeta raiz ...");
//		Carpeta carpetaRaiz = new Carpeta ("root");
//		System.out.println("Creando carpeta temporal ...");
//		Carpeta carpetaTemp = new Carpeta ("temp");
//		System.out.println("Creando carpeta trash ...");
//		Carpeta trash = new Carpeta("trash");
//		System.out.println("Creando archivo autoexec.bat de 100 bytes ...");
//		Archivo autoexec = new Archivo("autoexec.bat",100);
//		System.out.println("Creando archivo imagen.jpg de 0 bytes ...");
//		Archivo imagen = new Archivo("imagen.jpg");
//		System.out.println("Modificando tamaño de imagen.jpg de 0 a 350 bytes ...");
//		imagen.setTamanio(350);
//		
//		System.out.println("Agregando carpeta temporal a carpeta raiz ...");
//		carpetaRaiz.addHijo(carpetaTemp);
//		System.out.println("Agregando archivo autoexec.bat a carpeta temporal ...");
//		carpetaTemp.addHijo(autoexec);
//		System.out.println("Agregando carpeta trash a carpeta temporal ...");
//		carpetaTemp.addHijo(trash);
//		System.out.println("Agregando archivo imagen.jpg a carpeta trash ...");
//		trash.addHijo(imagen);
//		
//		EntidadSistemaFicheros root = carpetaRaiz;
//		System.out.println("El tamaño real de raiz es " + root.calcularTamanio());
		
		// PARTE 2 - Con interfaces
		
		FileSystemWatcher observer = new FileSystemWatcher();
		EntidadSistemaFicheros.RegistrarQuienMira(observer);
		Carpeta carpetaRaiz = new Carpeta ("root");
		Carpeta carpetaTemp = new Carpeta ("temp");
		Carpeta trash = new Carpeta("trash");
		Archivo autoexec = new Archivo("autoexec.bat",100);
		Archivo imagen = new Archivo("imagen.jpg");
		imagen.setTamanio(350);
		
		carpetaRaiz.addHijo(carpetaTemp);
		carpetaTemp.addHijo(autoexec);
		carpetaTemp.addHijo(trash);
		trash.addHijo(imagen);
		
		EntidadSistemaFicheros root = carpetaRaiz;
		System.out.println("El tamaño real de raiz es " + root.calcularTamanio());
	}
}
