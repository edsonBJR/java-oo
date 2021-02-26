package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Renan Saggio");
		
//		System.out.println(alunos.size());
//		
//		System.out.println(alunos);
//		
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
//		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
//		System.out.println(pauloEstaMatriculado);
//		
//		// Caso precisemos procurar por um elemento quando temos um conjunto implementando
//		// instanciamos uma referência para o tipo List<> e passos o conjunto como parametro
//		List<String> alunosEmLista = new ArrayList<>(alunos);
	}

}
