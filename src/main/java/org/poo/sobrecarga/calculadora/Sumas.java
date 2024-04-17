package org.poo.sobrecarga.calculadora;

public class Sumas {
	
	public static int sumar(int a, int b) {
		return a + b;
	}
	
	public static Float sumar(float a, float b) {
		return a + b;
	}
	
	public static Float sumar(int a, float b) {
		return a + b;
	}
	
	public static Float sumar(float a, int b) {
		return a + b;
	}
	
	public static Double sumar(double a, double b) {
		return a + b;
	}
	
	public static Double sumar(double a, int b) {
		return a + b;
	}
	
	public static Double sumar(double a, float b) {
		return a + b;
	}
	
	public static int sumar(String a, String b) {
		int res = 0;
		try {
			res = Integer.parseInt(a) + Integer.parseInt(b);
		} catch (NumberFormatException e) {
			System.out.println(e);
			return res;
		}
		return res;
		
	}
	
	public static int sumar(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int sumar(int... numeros) {
		int total =0;
		for(int i:numeros) {
			total +=i;
		}
		
		return total;
	}

}
