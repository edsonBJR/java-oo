package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Mario";
		String outro = new String("Alura");
		
		String novo = outro.replace('A', 'a');
		System.out.println(novo);
		
		String nova = nome.toLowerCase();
		System.out.println(nova);
		
		char c = nome.charAt(3);
		System.out.println(c);
		
		int pos = nome.indexOf("rio");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
		
		CharSequence cs = new StringBuilder("também é uma sequencia de caracteres");
		
		String name = "ALURA";
		CharSequence ca = new StringBuilder("al");
		
		name = name.replace("AL", ca);
		
		System.out.println(name);
		
		
		//int a = 3; // Aqui temos um primitivo e não uma Classe
		
		// String também são objetos
//		String nome = "Alura"; // Essa sintaxe é conhecida como Object Literal
//		
//		// Funciona mas é má pratica
//		//String outroNome = new String("Alura");
//		
//		String outra = nome.replace("A", "a");
//		
//		System.out.println(outra);
//		
//		String outro = nome.toUpperCase();
//		
//		System.out.println(outro);
		
	}
}
