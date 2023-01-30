package Jax;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class script {

	@XmlAttribute(name="type")
	private String type;
	
	@XmlElement(name="params")
	private List<params> params;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<params> getParams() {
		return params;
	}

	public void setParams(List<params> params) {
		this.params = params;
	}

	public script() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "script [type=" + type+ ", params=" + params + "]";
	}
	
	
	
	
}
