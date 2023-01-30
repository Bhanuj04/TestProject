package Jax;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class playerConfigurations {
	
	@XmlElement(name="playerConfig")
	private playerConfig playConfig;

	public playerConfig getPlayCon() {
		return playConfig;
	}

	public void setPlayCon(playerConfig playConfig) {
		this.playConfig = playConfig;
	}

	public playerConfigurations() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "playerConfigurations [playConfig=" + playConfig + "]";
	}

	


	

	
	
	

}
