package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteCurrentMilis {

	public static void main(String[] args) throws IOException {
		
		 long ini = System.currentTimeMillis();

	        BufferedWriter bw = new BufferedWriter(new FileWriter("currentTimeMilis.txt"));

	        bw.write("Edson Barbosa Junior");
	        bw.newLine();
	        bw.write("Desenvolvedor Java");

	        bw.close();

	        long fim = System.currentTimeMillis();

	        System.out.println("Passaram " + (fim - ini) + " milissegundos");
	}

}
