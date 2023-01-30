package Revison;           //heirarchical                                                                                                                                                   

class Birdd {
	void fly() {
		System.out.println("ALL BIRDS FLY");
	}
}
class Parrott extends Bird {
	void Colour() {
		
		System.out.println("Green");
		
	}
}
class Crow extends Bird {
	void voice() {
		System.out.println("Special voice");
	}
}

public class Rev3 {

	public static void main(String[] args) {
		
		Parrot obj = new Parrot();
		Crow obj1 = new Crow();
		
		obj1.fly();
		obj1.voice();
		
		obj.fly();
		obj.Colour();
     
	}

}
