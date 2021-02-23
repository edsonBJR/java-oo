package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		
		System.out.println(cc);
		System.out.println(cp);
		
		println(cc.toString());
		println(cp.toString());
		
	}
	
	// Estamos fazendo sobrecarga nos métodos abaixo
	static void println() {}
	
	static void println(int a) {}
	
	static void println(boolean bool) {}
	
	static void println(Object o) {}
}
