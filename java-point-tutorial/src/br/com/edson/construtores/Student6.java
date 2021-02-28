package br.com.edson.construtores;

public class Student6 {
	
	int id;
	String name;
	
	Student6 (int i, String n) {
		id = i;
		name = n;
	}

	Student6 (Student6 s) {
		id = s.id;
		name = s.name;
	}
	
	void display() {
		System.out.println(id + " - " + name);
	}
	
	public static void main(String[] args) {
		
		// Aqui temos objetos com as mesmas informações so que com referências diferentes.
		// Apontam para referencias de memórias diferentes
		Student6 s1 = new Student6(111, "Edson");
		Student6 s2 = new Student6(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1.display();
		s2.display();
	}
}
