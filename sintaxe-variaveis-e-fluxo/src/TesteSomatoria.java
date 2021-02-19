// Calculando a somatoria de todos os numeros de 0 a 10 e incrementando o valor total
public class TesteSomatoria {
	
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;

		while(contador <= 10) {
			total += contador;
			contador++;
		}
		System.out.println(total);
	}

}
