package Revison;
class Stud{
	private int id;
	private String name;
    private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
		
}
class Address{
	private int pincode;
	private String city;
	public int getPincode() {
		return pincode;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}
	
	
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud stud = new Stud();
		Address address = new Address();
		stud.setId(20);
		stud.setName("jay");
		stud.setAddress(address );
		address.setCity("Idr");
		address.setPincode(452005);
//		System.out.println(stud.getId());
//		System.out.println(stud.getName());
//		System.out.println(stud.getAddress());
//		System.out.println(address.getCity());
//		System.out.println(address.getPincode());
		
		//na,e pincode ,city
		
		StudentTest.printDetails(stud);
	}
	
	public static  void printDetails(Stud stud) {
		
		String name =stud.getName();
		int address =stud.getAddress().getPincode();
		String city =stud.getAddress().getCity();
		
		
		//System.out.println("Name =" + stud.getName() + "Pin code ="stud.getAddress(). + "City ");
		System.out.println("Name is" + name + "Add" + address + " city is" + city);
	}
	
	
	

}
