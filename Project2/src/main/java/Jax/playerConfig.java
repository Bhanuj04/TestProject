package Jax;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class playerConfig {
	
	@XmlAttribute(name="displayDeviceId")
	private String displayDeviceId;
	
	@XmlAttribute(name="dvcId")
	private String dvcId;
	@XmlAttribute(name="hotelId")
	private String hotelId;
	
	@XmlAttribute(name="roomNumber")
	private String roomNumber;
	
	@XmlElement(name="player")
	public List<player> player;

	

	public String getDisplayDeviceId() {
		return displayDeviceId;
	}

	public void setDisplayDeviceId(String displayDeviceId) {
		this.displayDeviceId = displayDeviceId;
	}

	public String getDvcId() {
		return dvcId;
	}

	public void setDvcId(String dvcId) {
		this.dvcId = dvcId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<player> getPlayer() {
		return player;
	}

	public void setPlayer(List<player> player) {
		this.player = player;
	}

	public playerConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "playerConfig [displayDeviceId=" + displayDeviceId + ", dvcId=" + dvcId + ", hotelId=" + hotelId
				+ ", roomNumber=" + roomNumber + ", player=" + player + "]";
	}

	
	
//	@XmlElement(name="connection")
//	private connection conn;
//	
//	
//	@XmlElement(name="scripts")
//	private scripts sc;
//	
	

}
