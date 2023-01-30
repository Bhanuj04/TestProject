package Jax;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class scripts {

	@XmlElement(name="script")
	private List<script> script;

	public List<script> getScript() {
		return script;
	}

	public void setScript(List<script> script) {
		this.script = script;
	}

	public scripts() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "scripts [script=" + script + "]";
	}


	
	
	
	
	
	
	
}
