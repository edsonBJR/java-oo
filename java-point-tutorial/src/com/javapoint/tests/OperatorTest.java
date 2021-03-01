package com.javapoint.tests;

public class OperatorTest {

	public static void main(String args[]) {
		int x = 10;
		System.out.println(x++); // 10 (11) -> imprime a variavel x e depois acrescenta uma unidade
		System.out.println(++x); // 12 -> acrescenta uma unidade a x e depois imprime o valor de x
		System.out.println(x--); // 12 (11) -> imprime a variavel x e depois subtrai uma unidade
		System.out.println(--x); // 10 -> subtrai uma unidade e depois imprime o valor de x

		System.out.println("#---------------------------------#");

		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a);// 10 + 12 = 22
		System.out.println(b++ + b++);// 10 + 11 = 21

		System.out.println("#---------------------------------#");

		a = 10;
		b = -10;
		boolean c = true;
		boolean d = false;
		System.out.println(~a);// -11 (minus of total positive value which starts from 0)
		System.out.println(~b);// 9 (positive of total minus, positive starts from 0)
		System.out.println(!c);// false (opposite of boolean value)
		System.out.println(!d);// true

		int f = -4;
		System.out.println(f);

		System.out.println("#---------------------------------#");
		System.out.println("Basic Mathematics Operations");

		int A = 10;
		int B = 5;
		System.out.println(A + B); // 15
		System.out.println(A - B); // 5
		System.out.println(A * B); // 50
		System.out.println(A / B); // 2
		System.out.println(A % B); // 0 resto da divisão

		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);

		System.out.println("#---------------------------------#");
		System.out.println("Java Left Shift Operator Examples");

		System.out.println(10 << 2);// 10 * 2 ^ 2 = 10 * 4 = 40
		System.out.println(10 << 3);// 10 * 2 ^ 3 = 10 * 8 = 80
		System.out.println(20 << 2);// 20 * 2 ^ 2 = 20 * 4 = 80
		System.out.println(15 << 4);// 15 * 2 ^ 4 = 15 * 16 = 240

		System.out.println("#---------------------------------#");
		System.out.println("Java Right Shift Operator Example");

		System.out.println(10 >> 2);// 10 / 2 ^ 2 = 10 / 4 = 2
		System.out.println(20 >> 2);// 20 / 2 ^ 2 = 20 / 4 = 5
		System.out.println(20 >> 3);// 20 / 2 ^ 3 = 20 / 8 = 2

		System.out.println("#---------------------------------#");
		System.out.println("Java Shift Operator Example: >> vs >>>");

		// For positive number, >> and >>> works same
		System.out.println(20 >> 2); // 5
		System.out.println(20 >>> 2); // 5
		// For negative number, >>> changes parity bit (MSB) to 0
		System.out.println(-20 >> 2); // -5
		System.out.println(-20 >>> 2); // 1073741819

		System.out.println("#---------------------------------#");

		int a1 = 4;
		int b1 = 5;
		int c1 = 20;
		System.out.println(a1 < b1 && a1 < c1);// false && true = false
		System.out.println(a1 < b1 & a1 < c1);// false & true = false

		System.out.println("#---------------------------------#");

		int a2 = 10;
		int b2 = 5;
		int c2 = 20;
		System.out.println(a2 < b2 && a2++ < c2); // false && true = false
		System.out.println(a2); // 10 because second condition is not checked
		System.out.println(a2 < b2 & a2++ < c2); // false && true = false
		System.out.println(a2); // 11 because second condition is checked

		System.out.println("#---------------------------------#");

		int a3 = 10;
		int b3 = 5;
		int c3 = 20;
		System.out.println(a3 > b3 || a3 < c3);// true || true = true
		System.out.println(a3 > b3 | a3 < c3);// true | true = true

		// || vs |

		System.out.println(a3 > b3 || a3++ < c3);// true || true = true
		System.out.println(a3);// 10 because second condition is not checked
		System.out.println(a3 > b3 | a3++ < c3);// true | true = true
		System.out.println(a3);// 11 because second condition is checked

		System.out.println("#---------------------------------#");
		System.out.println("Ternary Operator Example");

		int a4 = 2;
		int b4 = 5;
		int min = (a4 > b4) ? a4 : b4;
		System.out.println(min);

		int a5 = 10;
		int b5 = 5;
		int min2 = (a5 < b5) ? a5 : b5;
		System.out.println(min2);

		System.out.println("#---------------------------------#");
		System.out.println("Assignment Operator Example");

		int a6 = 10;
		int b6 = 20;
		a6 += 4;// a6 = a6 + 4 (a6 = 10 + 4)
		b6 -= 4;// b6 = b6 - 4 (b6 = 20 - 4)
		System.out.println(a6);
		System.out.println(b6);

		// Lembrar que a variavel está alterando o valor a cada operação
		int a7 = 10;
		a7 += 3; // 10 + 3
		System.out.println(a7);
		a7 -= 4; // 13 - 4
		System.out.println(a7);
		a7 *= 2; // 9 * 2
		System.out.println(a7);
		a7 /= 2; // 18 / 2
		System.out.println(a7);

		System.out.println("#---------------------------------#");
		System.out.println("Assignment Operator Example: Adding short");
		short a8 = 10;
		short b8 = 10;
		// a+=b;//a=a+b internally so fine
		// a8 = a8 + b8;// Compile time error because 10+10=20 now int
		a8 = (short) (a8 + b8); // Aqui estamos fazendo um Casting do resultado da operação de inteiros para short
		System.out.println(a8);
		
		
	}

}
