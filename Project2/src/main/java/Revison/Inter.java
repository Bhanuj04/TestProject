package Revison;

interface holiday {
	void draw();
}
interface saturday {
	
	void draw();
	void print();
}


class monday implements holiday,saturday {
	
	public void draw() {
		System.out.println("Drawing");
	}
	
	public void print() {
		System.out.println("Colouring");
	}
	
}
	class stringg {
		public void buffer() {
			StringBuffer sb = new StringBuffer("Hello");
			
			System.out.println(sb.append("Java"));
			
			System.out.println(sb.insert(1, "good"));
		}
			public void builderr() {
			StringBuilder sbb = new StringBuilder("kki");
			System.out.println(sbb.insert(1, "good"));
			}
		}
	


public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  monday obj = new monday();
		 obj.draw();
		 obj.print();
		 
		stringg obj1 = new stringg();
		obj1.buffer();
		obj1.builderr();
		
		
	}

}
