package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSV {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);	
			
//			Aqui temos uma implementação utilizando os métodos da classe Scanner
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			Integer agencia = linhaScanner.nextInt();
			Integer numero = linhaScanner.nextInt();
			String nomeTitular = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble();
			
//			String formatado = String.format(new Locale("pt", "BR"),"%s - %04d-%08d, %20s: %08.2f", 
//												tipoConta, agencia, numero, nomeTitular, saldo);
			System.out.println(String.format(new Locale("pt", "BR"),"%s - %04d-%08d, %20s: %08.2f", 
												tipoConta, agencia, numero, nomeTitular, saldo));
//			System.out.println(formatado);
//			System.out.println(valor1 + ", " + valor2 + ", " + valor3 + ", " + valor4 + ", " + valor5);
			
			linhaScanner.close();
			
//			Aqui temos uma implementação manual que podemos fazer
//			String[] valores = linha.split(","); // Gerando um array com os elementos do arquivo CSV.
//			System.out.println(Arrays.toString(valores)); // Imprimindo o array
//			System.out.println(valores[3]); // Imprimindo apenas um indice do array
		}
		
		scanner.close();
	}

}
