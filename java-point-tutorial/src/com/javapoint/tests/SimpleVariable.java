package com.javapoint.tests;

public class SimpleVariable {

	public static void main(String[] args) {
		
//		Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
//		Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.
		
		int a = 10; // local variable
		int b = 10; // local variable
		int c = a + b; // local variable
		System.out.println(c); // local variable

		a = 10; // local variable
		float f = a; // local variable
		System.out.println(a);
		System.out.println(f);

		float g = 10.5f;
		// int a = f; // Compile time error
		a = (int) g; // Casting um tipo float armazenado dentro de um int
		System.out.println(g);
		System.out.println(a);

		// Overflow - Transbordou
		a = 127;
		byte h = (byte) a; // Aqui 130 corresponde a -126, porque passou de 127, o máximo do tipo byte
		System.out.println(a);
		System.out.println(h);

		// Adding Lower Type, embora aceito o valor 10 ao, somar retorna um inteiro e não um byte
		byte j = 10;
		byte k = 10;
		// byte c = a + b; // Compile Time Error: because a + b = 20 will be int
		byte l = (byte) (j + k);
		System.out.println(l);
		

	}

}
