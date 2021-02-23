package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		// Simulando uma comunicação via rede
		Socket s = new Socket();

//		FileInputStream fis = new FileInputStream("lorem.txt");	
		InputStream fis = System.in;
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = System.out; //new FileOutputStream("lorem2.txt");	
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
	}

}
