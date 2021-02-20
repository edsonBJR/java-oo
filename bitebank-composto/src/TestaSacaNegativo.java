
public class TestaSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200));
		
		conta.saca(101);
		System.out.println(conta.getSaldo());
		
//		// O acesso aos atributos da Classe que foi instânciada devem ser proíbidos
//		conta.saldo = conta.saldo - 101;
//		System.out.println(conta.saldo);
		
	}
}
