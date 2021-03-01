package com.javapoint.abstracts;

public class TesteVehicle {

	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		Vehicle.Car c = obj.new Honda();
		c.display();
	}
}

class Vehicle {
	abstract class Car {
		abstract void display();
	}

	class Honda extends Car {

		@Override
		void display() {
			System.out.println("inner abstract class is invoked");
		}
	}
}
