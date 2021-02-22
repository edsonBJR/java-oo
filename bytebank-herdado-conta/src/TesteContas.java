
public class TesteContas {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("O saldo da Conta Corrente é: " + cc.getSaldo());
		System.out.println("O saldo da Conta Poupança é: " + cp.getSaldo());
	}

}
