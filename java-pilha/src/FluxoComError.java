
public class FluxoComError {
	
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
	    
		System.out.println("Fim do main");
	}
	
	private static void metodo1()  throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	// Esse método chama ele mesmo várias vezes o que causa um estou de pilha de execuçao da JVM
	// famoso erro stackoverflow
	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("Deu errado demais!!!");
//		metodo2();	
//		System.out.println("Fim do metodo2");
	}

}
