package Jaxbb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Backend {
	
	@XmlElement(name="oneAuthHostApi")
	private int oneAuth;
	
	@XmlElement(name="clientId")
	private int clientId;
	
	@XmlElement(name="clientSecretKey")
	private int clientSecret;
	
	@XmlElement(name="oneAuthToken")
	private int token;
	
	@XmlElement(name="oneAuthWaitTimeout")
	private int timeout;
	
	@XmlElement
	private List<pmsiApi> pmsiApi;
	
	@XmlElement
	private List<welcomeLetterApi> welcomeLetterApi;
	
	

	public Backend() {
		super();
	}

	public int getOneAuth() {
		return oneAuth;
	}

	public void setOneAuth(int oneAuth) {
		this.oneAuth = oneAuth;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(int clientSecret) {
		this.clientSecret = clientSecret;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public List<pmsiApi> getPmsiApi() {
		return pmsiApi;
	}

	public void setPmsiApi(List<pmsiApi> pmsiApi) {
		this.pmsiApi = pmsiApi;
	}

	@Override
	public String toString() {
		return "Backend [oneAuth=" + oneAuth + ", clientId=" + clientId + ", clientSecret=" + clientSecret + ", token="
				+ token + ", timeout=" + timeout + ", pmsiApi=" + pmsiApi + "]";
	}
	
	
	
	
	
	
	

}
