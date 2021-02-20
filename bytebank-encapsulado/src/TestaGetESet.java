
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
////		conta.numero = 1337;
//		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
//		conta.titular = paulo;
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		// Aqui estamos pegando o Nome do Titular apartir do método que acessa o atributo titular
		System.out.println(conta.getTitular().getNome());
		
		// Aqui estamos setando a profissão do Titular apartir do método que acessa o atributo titular
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
		// Agora vamos alterar a profissão em duas linhas criando uma variável temporaria no meio do caminho
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Analista");
		System.out.println(conta.getTitular().getProfissao());
		
		// Agora vamos comprar as três referências que criamos
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		
	}
}
