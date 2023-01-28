package Revisonn;


interface inter {
	void print();
}

class understand implements inter {
	public void print() {
		System.out.println("whwhw");
	}
}
public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		inter obj = new understand();
		obj.print();
	}

}
