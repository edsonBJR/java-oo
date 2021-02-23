package br.com.bytebank.banco.teste.util;

import java.util.Arrays;
import java.util.List;

public class TesteArgs {
	
	  public static void main(String[] args) {
	    List<String> argumentos = Arrays.asList(args);
	    for(String argss : argumentos) {
	    	System.out.println(argss);
	    }
	  }

}
