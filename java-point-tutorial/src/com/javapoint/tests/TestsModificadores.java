package com.javapoint.tests;

class Animal {
	Animal() {
		super();
	}
}

class Bird extends Animal {
	Bird(String name) {
		System.out.print(name);
	}
	Bird() {
		System.out.print("unknow");
	}
}

class TestsModificadores {

	public static void main(String[] args){
		
		new Bird("parrot");
		
	}

}

