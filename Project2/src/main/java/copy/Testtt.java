package copy;

public class Testtt  implements Cloneable {   //marker interface
	        
	int x=10;
	int y=20;  

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub    //checked exception
		
		

	//type casting essential otherwise not compatible

	Testtt t1 = new Testtt();
		Testtt t2 = (Testtt)t1.clone();  //clone method belongs to object class
		
		t2.x = 888;
		t2.y = 970;
		
		System.out.println(t1.x + " " + t1.y + " "+t2.x + " " + t2.y);
	
		//values updated in t2 does affect t1
		//Used when want to maintain backup
		//Preserve state of object

}
}
