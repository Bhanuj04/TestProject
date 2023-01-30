package Revison;

interface Drawb {
	void draw();
}

class Triangle implements Drawb {
	public void draw() {
		System.out.println("Rectangle");
	}
}

public class Rev10 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawb d = new Triangle();
		d.draw();
		

	}

}
