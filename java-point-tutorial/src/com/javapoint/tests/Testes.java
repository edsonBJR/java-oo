package com.javapoint.tests;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Testes {
	
	private String name;
	private boolean pass;
	
	public static void main(String[] args) {

//		int x = 10;
//		System.out.println(x > 10 ? "x" :x < 10 ? "<" : "=");
		
//		Testes ts = new Testes();
//		System.out.println("name = " + ts.name);
//		System.out.println(",pass = " + ts.pass);
//		
//		float i = 4;
//		float j = 2;
//		
//		float z = i + j;
//		
////		Integer number = Integer.valueOf("808.1");
////		System.out.println(number);
//		
////		soma(1, 2);
		
//		StringBuilder sb = new StringBuilder("1Z0");
//		sb.concat("-808");
//		System.out.println(sb);
		
//		System.out.println(new LocalTime().);
//		LocalDate date = LocalDate.of(2015, 3, 26);
//		Period p = Period.ofDays(1);
//		System.out.println(date.plus(p));
		
//		Runnable run = () -> System.out.println("Run");
		
		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(13);
		list.add(30);
		list.add(11);
		list.removeIf(e -> e%2 != 0);
		System.out.println(list);
		
		System.out.println(LocalTime.now());
		
	}

}
