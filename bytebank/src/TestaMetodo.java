
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		
		if(conseguiuRetirar) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println(contaDaMarcela.saldo);
		
		boolean sucessoTransferencia = 
				contaDaMarcela.transfere(3000, contaDoPaulo);
		if(sucessoTransferencia) {
			System.out.println("Transferencia realizada com sucesso!");
		}
		else {
			System.out.println("Transferencia não realizada!");
		}
		
		System.out.println(contaDaMarcela.saldo);		
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}

}
