package br.com.alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario>{

	@Override
	public int compare(Funcionario func1, Funcionario func2) {
		if(func1.getIdade() < func2.getIdade()) {
			return -1;
		} else if(func1.getIdade() > func2.getIdade()) {
			return 1;
		} else {
			return 0;			
		}
	}

}
