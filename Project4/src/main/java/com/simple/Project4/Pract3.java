package com.simple.Project4;
class A {
	void AA() {
		System.out.println("hfhd");
	}
}
class b extends A {
	void bb() {
		System.out.println("hhh");
	}
}
class c extends A {
	void cc() {
		System.out.println("gg");
	}
}

public class Pract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj = new c();
		b obj1 = new b();
		obj.AA();
		
		obj.cc();
		 obj1.AA();
		 obj1.bb();
		
		
		

	}

}
