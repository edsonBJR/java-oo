package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {

	public static void main(String[] args) {

		Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis();

        long iniForInsercao = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        long fimForInsercao = System.currentTimeMillis();
        long totalForInsercao = fimForInsercao - iniForInsercao;

        long iniForBusca = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        long fimForBusca = System.currentTimeMillis();
        long totalForBusca = fimForBusca - iniForBusca;

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto no laço for Inserçao: " + totalForInsercao);
        System.out.println("Tempo gasto no laço for Busca: " + totalForBusca);
        System.out.println("Tempo gasto: " + tempoDeExecucao);

	}

}
