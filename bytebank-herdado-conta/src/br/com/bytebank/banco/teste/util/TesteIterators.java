package br.com.bytebank.banco.teste.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteIterators {

	public static void main(String[] args) {
		
//		List<String> nomes = new ArrayList<>();
//		nomes.add("Super Mario");
//		nomes.add("Yoshi"); 
//		nomes.add("Donkey Kong"); 
//
//		Iterator<String> it = nomes.iterator();
//
//		List<Integer> numeros = new ArrayList<>();
//		numeros.add(1234);
//		numeros.add(432);
//		numeros.add(654);
//		
//		Iterator<Integer> itNum = numeros.iterator();
		
		Set<String> nomes = new HashSet<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}

//		while(it.hasNext()) {
//		  System.out.println(it.next());
//		}
		
//		while(itNum.hasNext()) {
//			System.out.println(itNum.next());
//		}
	}

}
