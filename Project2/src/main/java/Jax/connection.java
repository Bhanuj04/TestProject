package Jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class connection {

	@XmlAttribute(name="type")
	private String type;
	
	@XmlElement(name="ip")
	private String ip;
	
	@XmlElement(name="port")
	private int port;
	
	@XmlElement(name="url")
	private int url;

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getUrl() {
		return url;
	}

	public void setUrl(int url) {
		this.url = url;
	}

	public connection() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "connection [type=" + type + ", ip=" + ip + ", port=" + port + ", url=" + url + "]";
	}

	
	
	
	
	
}
