package Jaxb;

import javax.xml.bind.annotation.XmlElement;

public class Address {
	
	@XmlElement(name="city")
	private String City;
	@XmlElement(name="country")
	private String Country;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", Country=" + Country + "]";
	}
	
	
	

}
