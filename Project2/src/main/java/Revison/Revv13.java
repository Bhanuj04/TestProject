package Revison;

interface A {
	void a();
	void c();
}

 abstract class B implements  A {
	public void c() {
		System.out.println("this is c");
	}
}

class M extends B {
	public void a() {
		System.out.println("this is a");
	}
}

public class Revv13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new M();
		obj.a();
		obj.c();
		

	}

}
