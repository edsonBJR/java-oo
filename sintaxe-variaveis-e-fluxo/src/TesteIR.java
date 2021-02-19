
public class TesteIR {
	
	public static void main(String[] args) {
		
		double salario = 300.0;
		
		boolean faixa1 = salario >= 1903.99 && salario <= 2826.65;
		boolean faixa2 = salario >= 2826.66 && salario <= 3751.05;
		boolean faixa3 = salario >= 3751.05 && salario <= 4664.68;
		boolean faixa4 = salario >= 4664.69;
		
		if(faixa1) {
			System.out.println("A aliquota é de 7,5 e o valor de desconto é de R$ 142,80");
		} else if (faixa2) {
			System.out.println("A aliquota é de 15 e o valor de desconto é de R$ 354,80");
		} else if (faixa3) {
			System.out.println("A aliquota é de 22,5 e o valor de desconto é de R$ 636,13");
		} else if (faixa4){
			System.out.println("A aliquota é de 27,5 e o valor de desconto é de R$ 869,36");
		} else {
			System.out.println("Qual é sua aliquota???");
		}

	}

}
