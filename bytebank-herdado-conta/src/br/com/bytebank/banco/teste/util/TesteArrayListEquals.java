package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		// Vamos aprender a primeira Estrutura de Dados a Lista com a implementação do
		// ArrayList.
		// Aqui já estamos trablhando com Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);

		System.out.println("Já existe? " + existe);

		for (Conta conta : lista) {
			if (conta.equals(cc3)) {
				System.out.println("Já tenho essa conta!");
			}
		}

		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
