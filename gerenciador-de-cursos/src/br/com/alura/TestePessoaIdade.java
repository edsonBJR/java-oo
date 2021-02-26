package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class TestePessoaIdade {

	public static void main(String[] args) {

		Map<Integer, String> pessoas = new HashMap<>();
		
        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        pessoas.put(36, "Edson Barbosa Junior");

        // Encontrei essa solução no forum da Alura
//        for(Integer key : pessoas.keySet()) {
//        	System.out.println(key + " - " + pessoas.get(key));
//        }
        
        System.out.println("#---------------------------#");
        
        Map<String, Integer> nomesParaIdade = new HashMap<>();
        
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        nomesParaIdade.put("Edson", 36);
        
        for(String keys : nomesParaIdade.keySet()) {
        	System.out.println(keys);
        }
        
        for(Integer values : nomesParaIdade.values()) {
        	System.out.println(values);
        }
        
        for(String key : nomesParaIdade.keySet()) {
        	System.out.println(key + " - " + nomesParaIdade.get(key));
        }
	}
}
