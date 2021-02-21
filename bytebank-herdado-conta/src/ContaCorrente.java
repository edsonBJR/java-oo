
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	
	// Aqui temos uma sobreescrita de um método da classe mãe. Para isso utilizamos a anotação @Override
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
		
	}
}
