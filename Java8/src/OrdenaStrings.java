import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

//		Comparator<String> comparador = new comparadorPorTamanho();
//		Collections.sort(palavras, comparador);
//		Abaixo temos uma implementação utilizando rescurso do Java 8, a própria coleção tem um método sort.

//		palavras.sort((String s1, String s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});
		
		// Lambda 01
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		// Lambda 02 - utilizando método que recebe uma interface funcional, uma interface com um único metodo abstrato
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		// Lambda 03 - reduzindo ainda mais o tamanho da Lambda
		// Traduzindo, palavras ordene utilizando o length da String
		palavras.sort(Comparator.comparing(String::length));
		
		// Mais opções
		// Isso não é reflection é metodo reference é uma forma de escrever lambda de uma forma mais enxuta
		Function<String, Integer> funcao1 = String::length;
		Function<String, Integer> funcao2 = s -> s.length();
		
		// Agora vamos quebrar o código da Lambda2 e trabalhar da forma antiga instanciando as interfaces devidas.
		Function<String, Integer> funcao = new Function<String, Integer>() {

			@Override
			public Integer apply(String s) {
				return s.length();
			}
			
		};
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);

		System.out.println(palavras);

//		for (String p: palavras) {
//			System.out.println(p);
//		}

//		Consumer<String> consumidor = new ImprimeNaLinha();
//		Aqui temos a instanciaçao de uma classe anônima
//		Consumer<String> consumidor = new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		};
//		palavras.forEach(consumidor);
//		palavras.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});
//	}

//		palavras.forEach((String s) -> {
//			System.out.println(s);
//		});
//		palavras.forEach(s -> {
//			System.out.println(s);
//		});

		// Essas duas linhas abaixo são equivalentes a linha palavras.forEach(s ->
		// System.out.println(s));
//		Consumer<String> impressor = s -> System.out.println(s);
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);

//		palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);

		// Aqui temos o método completo
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Executando um Runnable");
			}

		}).start();

		// Aqui temos a implementação da Lambda desse método
		new Thread(() -> System.out.println("Executando um Runnable")).start();

	}

}

//class ImprimeNaLinha implements Consumer<String> {
//
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//	}
//	
//}

//class comparadorPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length())
//			return -1;
//		if (s1.length() > s2.length())
//			return 1;
//		return 0;
//	}
//
//}
