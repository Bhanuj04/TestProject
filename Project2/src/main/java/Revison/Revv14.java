package Revison;

class Aa{
	String color = "black";
	void eat() {
		System.out.println("what to eat");
	}
}

class Bb extends Aa {
	String color = "Green";
	void printColour() {
		System.out.println(color);
		System.out.println(super.color); //super is used to refer to immediate parent object
	}
	
}

public class Revv14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bb obj = new Bb();
		obj.printColour();
		obj.eat();

	}

}
