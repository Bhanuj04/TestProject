package copy;
import java.lang.*;

//class Testt  {
//	
//}

public class Cop implements Cloneable {
	int x=10;
	int y=20;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Testt t1 = new Testt();
		Testt t2 = (Testt)t1.clone();
		
		t2.x = 888;
		t2.y = 970;
		
		System.out.println(t1.x + " " + t1.y + " "+t2.x + " " + t2.y);

	}

}
