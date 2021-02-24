package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		Aqui estamos gravando em um arquivo binário uma String
//		String nome = "Edson Junior";
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Edson Junior");
//		cliente.setCpf("098765432");
//		cliente.setProfissao("Desenvolvedor");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
//		Aqui estamos lendo dados de um arquivo binário e imprimindo a saída no console
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		
		System.out.println(cliente.getProfissao());
		
	}

}
