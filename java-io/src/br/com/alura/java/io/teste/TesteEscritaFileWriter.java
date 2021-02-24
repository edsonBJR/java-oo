package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

//		Aqui temos um método de mais baixo nível
//		OutputStream fos = new FileOutputStream("lorem2.txt");	
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		Aqui temos um método de nível mais alto
//		FileWriter fw = new FileWriter("lorem2.txt");	
//		fw.write("Edson Barbosa Junior");
//		fw.write(System.lineSeparator()); // Aqui estamos utilizando a classe System com um método estático dela.
//		fw.write(System.lineSeparator()); // esse método estático, que devolve uma String no Unix "\n" e no Windows "\r\n"
//		fw.write("Edson Enricco Barbosa");
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write("Rosiane de Fátima Barbosa");
//		fw.close();

//		Aqui temos método de um nível mais alto só que repassando para o BufferWriter
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Edson Barbosa Junior");
		bw.newLine(); // Aqui estamos utilizando a classe System com um método estático dela.
		bw.newLine(); 
		bw.write("Qualquer coisa...");
		bw.newLine();
		bw.newLine();
		bw.write("Qualquer coisa..");
		bw.close();
		
	}

}
