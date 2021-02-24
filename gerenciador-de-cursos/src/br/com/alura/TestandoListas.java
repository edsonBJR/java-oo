package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais as listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		// Aqui estamos instanciando um array utilizando a interface ArrayList e adicionando as Strings a esse Array
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		
		// Aqui estamos removendo uma Aula pelo seu indice
		aulas.remove(0);
		System.out.println(aulas);
		
		// Aqui estamos percorrendo o Array e imprimindo indice por indice concatenado com uma String
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		System.out.println(aulas.size());
		
		// Aqui temos uma Lambda em Java
		// Sempre observo o uso de Lambdas em metódo que implementando como parâmetro os Consumers
		aulas.forEach(aula -> {
			System.out.println("Percorrendo");
			System.out.println("Aula: " + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println("Depois de ordenado: ");
		System.out.println(aulas);
		

	}

}
