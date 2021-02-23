package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); // Autoboxing
		System.out.println(idadeRef.intValue()); // Unboxing
		
		Double dRef = Double.valueOf(3.2); // Autoboxing
		System.out.println(dRef.doubleValue()); // Unboxing
		
		Boolean bRef = Boolean.FALSE; // Autoboxing
		System.out.println(bRef.booleanValue()); // Unboxing
		
		Number refNumero = Float.valueOf(29.9f);  // Aqui estamos referenciando a um tipo mais específico
		
		// Criando uma lista de números mais genérica
		List<Number> lista = new ArrayList();
		lista.add(13);
		lista.add(23.3);
		lista.add(21.3f);
		
		for(Number num : lista) {
			System.out.println(num);
		}
		

	}

}
