package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TesteCursoComAluno {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34762);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
//		System.out.println("Todos os alunos matriculados: ");
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});
		
//		Mesmo for do acima so que antes do Java 8
//		for(Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
//		Mesmo exemplo do for acima so que versões mais antigas do java
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
//		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(a1));
//		
//		String alunoProcurado = "Rodrigo Turini";
//		
//		Aluno turini = new Aluno("Rodrigo Turini", 34672);
//		System.out.println("E esse Turini, está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(turini));
//		
//		System.out.println("O a1 é equals ao Turini?");
//		System.out.println(a1.equals(turini));
	}

}
