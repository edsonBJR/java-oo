package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunosSemAcentos {
	
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
        //1) adicione alguns alunos
		alunos.add("Edson Barbosa Junior");
		alunos.add("Edson Enricco Barbosa");
		alunos.add("Rosiane de Fátima Barbosa");
		System.out.println(alunos);
		System.out.println("#----------------------");
		
        //2) imprima o tamanho da colecao
		System.out.println(alunos.size());
		System.out.println("#----------------------");
		
        //3) tente adicionar um aluno que existe
		alunos.add("Edson Enricco Barbosa");
		System.out.println(alunos);
		System.out.println("#----------------------");
		
        //4) imprima novamente o tamanho da colecao
		System.out.println(alunos.size());
		System.out.println("#----------------------");
		
		//5) verificando se aluno com acento e sem acento é encontrado
		System.out.println(alunos.contains("Rosiane de Fátima Barbosa"));
		System.out.println("#----------------------");
	}

}
