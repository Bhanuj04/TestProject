package Jax;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class param {

	@XmlAttribute(name="type")
	private String type;
	
	

	
	
	@XmlValue
	private String param; 
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public param() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "param [type=" + type + ", param=" + param + "]";
	}

	
	
	
	
	
}
