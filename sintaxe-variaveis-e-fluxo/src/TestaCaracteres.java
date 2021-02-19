
public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		// Aqui estamos trabalhando com a tabela unicode
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		// No dia a dia vamos trabalhar mesmo com palavras e pra isso vamos utilizar a String
		// String referencia a um objeto que tem vários métodos associados 
		
		String palavra = "Alura cursos online de tecnologia ";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		
	}

}
