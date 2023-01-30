package Jaxbb;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class welcomeLetterApi {

	@XmlAttribute(name="type")
	private String type;
	
	@XmlAttribute(name="waitTimeout")
	private int waitTimeout;
	
	@XmlElement(name="url")
	private String url;
	
	@XmlElement(name="headers")
	private List<headers> headers;
	
	private List<> queryParams
}
