package copy;

class Test {
	int x,y;
	
	Test() {
		x=20;
		y=30;
	}
}
public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj = new Test();
		
		System.out.println("Values of x and y are" + obj.x+ " "+obj.y);
		
		Test obj2 = obj;  //reference copy is created
		
		obj2.x=50;  //updating values of obj2 will affect values of obj
		
		System.out.println("value ofx and y are" + obj.x + " " + obj.y);
		
		
		
	}

}
