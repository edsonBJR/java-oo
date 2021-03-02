package br.com.caelum.leilao.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;


public class TesteDoAvaliador {
	
	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		
//		Parte 1 dos testes
//		Aqui estamos criando os cenários de teste
//		Criando usuarios, criando o leilão e o leiloeiro
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("PlayStation 5 Novo");
		
		leilao.propoe(new Lance(joao, 250.0));
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(joao, 400.0));
		
		//Parte 2 dos teste
		// Aqui estamos invocando uma ação que irá testar os dados criados acima
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
//		Parte 3 dos teste
//		Aqui temos a validação onde imprimimos na tela o resultado do teste 2
//		podemos criar uma váriavel que irá guardar os valores que esperamos, por exemplo maior e menor esperado
		double maiorEsperado = 400.0;
		double menorEsperado = 250.0;
		double mediaLances = 316.6666666666667;
		
//		Agora vamos imprimir na tela a comparação entre maior e menor esperado
//		Agora estamos ensinando ao computador a compara o resultado
//		System.out.println(maiorEsperado == leiloeiro.getMaiorLance());
		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
//		System.out.println(menorEsperado == leiloeiro.getMenorLance());
		Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
//		System.out.println(leiloeiro.mediaLances(leilao));
		Assert.assertEquals(mediaLances, leiloeiro.mediaLances(leilao), 0.00001);
	}

}
