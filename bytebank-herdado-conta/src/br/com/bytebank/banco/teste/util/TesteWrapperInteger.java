package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		// Array de primitivos
		int[] idades = new int[5];
		
		// Array de referencia
		String[] nomes = new String[5];
		
		int idade = 29; // Aqui temos um primitivo que é representado por um classe INTEGER
		Integer idadeRef = new Integer(idade); // Está forma está deprecado nas novas versões
		Integer idadeRefNova = Integer.valueOf(29); // Está é a forma atual de instanciar.  --> Autoboxing
		int valor = idadeRefNova.intValue(); // unboxing
		System.out.println(valor);
		
		System.out.println(idadeRef.doubleValue()); // Aqui estamos transformando em um tipo primitivo double
		
		String s = args[0];
		Integer numero = Integer.valueOf(s);
		int numeroParsing = Integer.parseInt(s);
		System.out.println(numero);
		System.out.println(numeroParsing);
		
		// No mundo de Listas só existe listas de REFERÊNCIAS
		List numeros = new ArrayList();
		// Vamos guardar esse primitivo dentro de um Array de referências
		// Aqui o Java 
		numeros.add(29); // Aqui estamos tendo um caso de AUTOBOXING.
		
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.BYTES); // --> Tamanho em Bytes
		System.out.println(Integer.SIZE); // --> Tamanho em Bits
		
        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
		

	}

}
