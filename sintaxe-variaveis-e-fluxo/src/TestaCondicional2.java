
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado é " + acompanhado);

		if (idade >= 18 && acompanhado) {
//		if (idade >= 18 && acompanhado == true) { -> nao precisa comparar dessa forma porque já esta implícito
//		if (idade >= 18 && quantidadePessoas >= 2) {
//		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente vocẽ não pode entrar");
		}
	}
}
