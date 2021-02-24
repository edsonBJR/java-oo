package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {

		//PrintStream ps = new PrintStream(new File("/home/edsonjr/Downloads/TestePrintStream.txt"));
		PrintWriter ps = new PrintWriter("lorem3.txt");
		
		ps.println("Edson Barbosa Junior");
		ps.println(); 
		ps.println();
		ps.println();
		ps.println();
		ps.println();
		ps.print("Agora ficou mais fácil ainda!!!");
		ps.close();
		
		System.out.println();
		
	}

}
