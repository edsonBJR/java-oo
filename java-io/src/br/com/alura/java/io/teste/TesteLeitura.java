package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com um Arquivo
		FileInputStream fis = new FileInputStream("lorem.txt");	
		//Agora vamos utilizar um tipo que sabe ler um FileInputStream
		InputStreamReader isr = new InputStreamReader(fis);
		//Agora vamos passar o fluxo de caracteres para uma interface que entregue linhas
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
	}

}
