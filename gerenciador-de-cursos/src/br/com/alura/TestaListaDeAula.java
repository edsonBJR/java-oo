package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArraysList", 21);
		Aula a2 = new Aula("Listas de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		// Exemplo de instanciação de referencia de um objeto e já adicionando a um array.
		// aulas.add(new Aula("Equals e HashCode", 15));
		
		System.out.println(aulas);
		
		Collections.sort(aulas);	
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		// Essa linha tem o mesmo efeito so que não precisamos utilizar uma interface que é a Collections
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
//		String s1 = "paulo";
//		String s2 = "silveira";
//		s1.compareTo(s2);
	}

}
