package com.javapoint.construtores;

public class Program {
	
	public static void main(String[] args) {
		
		Comparable s1 = "Abc";
		Comparable s2 = new String("Abc");
		System.out.println(s1.equals(s2));
	}
}
