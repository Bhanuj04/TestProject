package com.simple.Project4;

class Bird {
	void fly() {
		System.out.println("hello");
	}
}
class Parrot extends Bird {
	void Colour() {
		System.out.println("green");
	}
}
class fast extends Parrot {
	void Hoou() {
		System.out.println("llk");
	}
}

public class Pract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fast obj = new fast();
		obj.fly();
		obj.Colour();
		obj.Hoou();
		

	}

}
