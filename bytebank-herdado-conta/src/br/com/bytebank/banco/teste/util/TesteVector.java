package br.com.bytebank.banco.teste.util;

import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteVector {

	public static void main(String[] args) {
		
		// Vamos aprender a primeira Estrutura de Dados a Lista com a implementação do Vector.
		// Aqui já estamos trablhando com Generics
		List<Conta> lista = new Vector<Conta>(); //thread safe, para quando tivemos várias pilhas de main
        
        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);
        
        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        System.out.println(lista.size());
        
        System.out.println("Tamanho: " + lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());
        
        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());
        
        Conta cc3 = new ContaCorrente(312, 234);
        lista.add(cc3);
        
        Conta cc4 = new ContaCorrente(765, 8567);
        lista.add(cc4);
        
        for(int i = 0; i < lista.size(); i++) {
        	System.out.println(lista.get(i));
        }
        
        System.out.println("-------------------------");
        
        for(Conta conta : lista) {
        	System.out.println(conta);
        }
	}

}
