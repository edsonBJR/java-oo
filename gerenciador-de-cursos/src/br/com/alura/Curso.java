package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
//	Agora vamos criar um atributo que mapeia um objeto aluno com sua respectiva matricula
//	com esse atributo vamos ter uma busca mais otimizada comparando chave valor
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>(); 
	
//	private Set<Aluno> alunos = new LinkedHashSet<>();
//	private Set<Aluno> alunos = new TreeSet<>();
	
	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		
//		O código abaixo pode ser escrito com uma linha apenas, a linha de cima utilizando recursos do java 8.
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", aulas" + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
	    return this.alunos.contains(aluno);
	}
	
	@Override
	public boolean equals(Object obj) {
	    Aluno outroAluno = (Aluno) obj;
	    return this.nome.equals(outroAluno);
	}
	
	@Override
	public int hashCode(){
	    return this.nome.hashCode();
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsValue(numero))
			throw new NoSuchElementException("Matrícula não encontrada. " + numero);
		return matriculaParaAluno.get(numero);
		
//		for (Aluno aluno : alunos) {
//			if(aluno.getNumeroMatricula() == numero) 
//				return aluno;
//		}
////		return null; // Isso não é uma boa prática é melhor lançar uma Exception que se encaixa no contexto.
//		throw new NoSuchElementException("Matrícula não encontrada." + numero);
	}
}
