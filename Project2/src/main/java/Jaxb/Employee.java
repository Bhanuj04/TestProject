package Jaxb;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Employee")
//@XmlType(propOrder = {"id","name","address","Salary"})
public class Employee {

	private String id,name,address;
	private int Salary;
	
	@XmlAttribute
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@XmlElement
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public Employee(String id, String name, String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		Salary = salary;
	}
	public Employee() {
		super();
	}
	
	
	
	
	
	
}
