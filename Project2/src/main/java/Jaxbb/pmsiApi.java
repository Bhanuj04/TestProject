package Jaxbb;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class pmsiApi {

	@XmlAttribute(name="type")
	private String type;
	
	@XmlAttribute(name = "waitTimeout")
	private int waitTimeout;
	
	@XmlElement(name="url")
	private String url;
	
	@XmlElement
	private List<headers> headers;
	
	@XmlElement
	private List<queryParams> queryParams;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWaitTimeout() {
		return waitTimeout;
	}

	public void setWaitTimeout(int waitTimeout) {
		this.waitTimeout = waitTimeout;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<headers> getHeaders() {
		return headers;
	}

	public void setHeaders(List<headers> headers) {
		this.headers = headers;
	}

	public List<queryParams> getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(List<queryParams> queryParams) {
		this.queryParams = queryParams;
	}

	@Override
	public String toString() {
		return "pmsiApi [type=" + type + ", waitTimeout=" + waitTimeout + ", url=" + url + ", headers=" + headers
				+ ", queryParams=" + queryParams + "]";
	}

	public pmsiApi() {
		super();
	}
	
	
	
	
	
}
