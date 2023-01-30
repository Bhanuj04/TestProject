package basics;
class Dog {
	String name="Moti";
	void colour() {
	
	System.out.println(name);
	System.out.println("Black colour");
}
}
class Man extends Dog{
	
	
	void col() {
		String name="eagle";
 
		System.out.println(super.name);
		System.out.println(name);
		
		System.out.println("Blue Colour");
		super.colour();
	}
	Man() {
		super();
		System.out.println("Man is Dog");
	}
}


public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man anim = new Man();
		anim.colour();
		anim.col();
		
		
	}

}

