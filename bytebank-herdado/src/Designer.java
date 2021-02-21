// Essa linha abaixo pode ser lida como Designer é um Funcionário ou Designer herda da classe Funcionário
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Desinger");
		return 150;
	}
	
}
