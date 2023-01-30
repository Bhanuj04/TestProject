package Jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Customer {
	@XmlAttribute(name="id")
	private int Id;
	@XmlElement(name="age")
	private int Age;
	
	@XmlElement(name="name")
	private String Name;
	
	@XmlElement
	private List<Address> Address;
	
	
	
	
	public Customer() {
		super();
	}
	public List<Address> getAddress() {
		return Address;
	}
	public void setAddress(List<Address> address) {
		Address = address;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", Age=" + Age + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	
	
	

}
