package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

//br.com.bytebank.banco.teste.TesteContas
public class TesteContas {
	
	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		//java.lang.System
		System.out.println("O saldo da Conta Corrente é: " + cc.getSaldo());
		System.out.println("O saldo da Conta Poupança é: " + cp.getSaldo());
	}

}
