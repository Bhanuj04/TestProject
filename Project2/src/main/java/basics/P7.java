package basics;
class Eployee{
	private int id;
	private String name;
	private Stdent s;
	
	public Eployee(int id, String name, Stdent st) {
		super();
		this.id = id;
		this.name = name;
		this.s = st;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Stdent getS() {
		return s;
	}
	public void setS(Stdent s) {
		this.s = s;
	}
	
	
}

class Stdent{
	
	private int roll;
	private String Address;
	private College c;
	
	public Stdent(int roll, String address, College c) {
		super();
		this.roll = roll;
		Address = address;
		this.c = c;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public College getC() {
		return c;
	}
	public void setC(College c) {
		this.c = c;
	}
	
}
class College {
	
	private int registeration;
	private String Degree;
	 
	public College(int registeration, String degree) {
		super();
		this.registeration = registeration;
		Degree = degree;
	}
	public int getRegisteration() {
		return registeration;
	}
	public void setRegisteration(int registeration) {
		this.registeration = registeration;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	
	
}



public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College coll = new College(987,"Btech");
		 Stdent st = new Stdent(70,"Kamal",coll );
		Eployee emp = new Eployee(10,"Jay",st);
		
		P7.print(st);
		P7.printEmp(emp);
      
	}
	static void print(Stdent st) {
		System.out.println(st.getC().getRegisteration());
		System.out.println(st.getC().getDegree());
		
	}
	static void printEmp(Eployee e) {
		System.out.println(e.getS().getRoll());
		System.out.println(e.getS().getC().getDegree());
	}

}
