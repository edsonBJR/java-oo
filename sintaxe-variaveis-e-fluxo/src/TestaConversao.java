
public class TestaConversao {
	
	public static void main(String[] args) {
		
		double salario = 1270.50;
		
		float pontoFlutuante1 = (float) 3.14;
		float pontoFlutuante2 = 3.14f;
		
		System.out.println(pontoFlutuante1  + ", " + pontoFlutuante2);
		
		int valor = (int) salario; // aqui estamos fazendo um casting antes de atribuir o valor double a um inteiro
		System.out.println(valor);
		
		long numeroGrande = 32432423532L;
		short valorPequeno = 2131;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
	}

}
