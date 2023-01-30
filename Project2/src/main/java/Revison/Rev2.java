package Revison;             //multilevel

class Bird {
	void fly() {
		System.out.println("ALL BIRDS FLY");
	}
}
class Parrot extends Bird {
	void Colour() {
		System.out.println("Green");
	}
}

class fast extends Parrot {
	void speed() {
		System.out.println("But my speed is fast");
	}
}
public class Rev2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fast obj = new fast();
		obj.fly();
		obj.Colour();
		obj.speed();
		

	}
}



