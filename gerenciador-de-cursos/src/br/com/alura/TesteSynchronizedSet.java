package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteSynchronizedSet {

	public static void main(String[] args) {
		
		Set<Aluno> alunos = new HashSet<>();
		
		alunos.add(new Aluno("Edson Barbosa Junior", 123456));
		alunos.add(new Aluno("Rosiane de Fátima Barbosa", 312645));
		alunos.add(new Aluno("Edson Enricco Barbosa", 678098));

		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		
	}

}
