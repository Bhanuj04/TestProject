package Jaxbb;

import javax.xml.bind.annotation.XmlAttribute;

public class queryParams {

	@XmlAttribute(name="name")
	private String queryParam;

	public String getQueryParam() {
		return queryParam;
	}

	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
	}

	
	public queryParams() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "queryParams [queryParam=" + queryParam + "]";
	}
	
	
}
