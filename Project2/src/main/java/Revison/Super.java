package Revison;

class Animal{
	String color="white";
	void write() {
		System.out.println("great day");
	}
}

class Dog extends Animal{
	
	Dog() {
		super();
		System.out.println("print val");
	}
	String color="black";
	void print() {
		System.out.println(color);
		System.out.println(super.color);  //1 refer immediate parent class variable
		super.write();  //2 invoking parent class method
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.print();

	}

}
