package Jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Company {

	@XmlElement(name="customer")
	private List<Customer> Customer;

	public List<Customer> getCustomer() {
		return Customer;
	}

	public void setCustomer(List<Customer> customer) {
		Customer = customer;
	}
	

	public Company() {
		super();
	}

	@Override
	public String toString() {
		return "Company [Customer=" + Customer + "]";
	}

	
}
