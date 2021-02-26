import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		// Vamos ordernar esses cursos de acordo com algum critério
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		// Tem limitações o método reference, aqui ele vai imprimir a referencia do objeto.
		cursos.forEach(System.out::println);
		// No caso assim precisamos utilizar a lambda e invocar o System.out.println
		cursos.forEach(c -> System.out.println(c.getNome()));
		
		// Imprimir todos os curso que tem mais de 100 alunos nele
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.forEach(c -> System.out.println(c.getNome()));;
			
		// Filtro para imprimir o total de alunos em cada curso com mais de 100 alunos
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(c -> c.getAlunos())
			.forEach(total -> System.out.println(total));
		
		// Mesma implementação do método acima so que utilizando method reference
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(Curso::getAlunos)
			.forEach(System.out::println); // Ainda estamos utilizando o método reference
		
		// Filtro pra imprimir o total de alunos em cada curso com mais de 100 alunos e somar todos os alunos deste curso
		int sum = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.mapToInt(Curso::getAlunos)
		.sum();
		System.out.println(sum);
		
		// Filtro para pegar os cursos com mais de 10 alunos
		Optional<Curso> optionalCurso = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny();
//		Curso curso = optionalCurso.orElse(null);
//		System.out.println(curso.getNome());
		
		// Caso não encontre o curso com o critério escolhido ele não imprimi nada melhor que null
		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
		
		// Mesmo efeito do bloco acima que está separado em busca e exibição dos dados
		cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.findAny()
				.ifPresent(c -> System.out.println(c.getNome()));
		
		// Calculando a média de alunos nos cursos com mais de 100 alunos
		OptionalDouble average = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.mapToInt(Curso::getAlunos)
			.average();
		
		System.out.println(average);
		
		// Agora vamos pegar a saida de um Stream e guardar dentro de uma collection, no caso um tipo List<>
		List<Curso> resultado = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toList());
		
		
		// Agora vamos pegar a saída de um Stream e guardar dentro de uma collection, no caso um tipo map
		// para armazenar chave e valor
		
		Map<String, Integer> map = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
					c -> c.getNome(), 
					c -> c.getAlunos()));
		
		System.out.println(map);
		
		cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(
						c -> c.getNome(), 
						c -> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
		
	}
}
