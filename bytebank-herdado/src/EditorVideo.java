// Essa linha abaixo pode ser lida como EditorVideo é um Funcionário ou EditoVideo herda da classe Funcionário
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Editor de Video");
		return super.getBonificacao() + 100;
	}
	
}
