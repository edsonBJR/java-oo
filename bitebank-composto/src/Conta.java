public class Conta {
	private double saldo;
	int agencia = 42;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
//		this.saldo = this.saldo + valor;
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	 public boolean transfere(double valor, Conta destino) {
		 if(saca(valor)) {
			 destino.deposita(valor);
			 return true;
		 }
		 return false;
	 }
	 
	 public double getSaldo() {
		 return this.saldo;
	 }
}