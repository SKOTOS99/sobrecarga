package org.poo.sobrecarga.calculadora;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println(Sumas.sumar(1, 2, 4));
		System.out.println(Sumas.sumar(1, 2));
		System.out.println(Sumas.sumar(1f, 2));
		System.out.println(Sumas.sumar(1f, 2f));
		System.out.println(Sumas.sumar(1.00, 2f));
		System.out.println(Sumas.sumar("4", "5"));
		System.out.println(Sumas.sumar(1, 2, 4,3,4,5,6));

		
		
		
	}

}
