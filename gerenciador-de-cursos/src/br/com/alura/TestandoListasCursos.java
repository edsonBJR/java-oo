package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListasCursos {

	public static void main(String[] args) {

		String curso1 = "Java 8: Tire proveito dos novos cursos da linguagem";
		String curso2 = "Apache Camel";
		String curso3 = "Certificado Java SE 8 Programer I";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println(cursos);
		
		System.out.println("O primeiro curso é o: " + cursos.get(0));
		
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("Aula : " + cursos.get(i));
        }
        
        Collections.sort(cursos);
        System.out.println(cursos);
	}

}
