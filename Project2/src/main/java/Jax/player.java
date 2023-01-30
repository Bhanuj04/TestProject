package Jax;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class player {
	
	@XmlAttribute(name="type")
	private String type;
	
	@XmlElement(name="driverId")
	private String driverId;
	
//	@XmlElement(name="connection")
//	private List<connection> connectionn;
	
	@XmlElement(name="connection")
	//@XmlAccessorType(XmlAccessType.FIELD)
	private connection connection;
	
	
	
	public connection getConnection() {
		return connection;
	}
	public void setConnection(connection connection) {
		this.connection = connection;
	}
	@XmlElement(name="scripts")
//	private List<scripts> scriptss;
	private scripts scripts;
	
	
	
	public scripts getScripts() {
		return scripts;
	}
	public void setScripts(scripts scripts) {
		this.scripts = scripts;
	}
	@XmlElement(name="vodSecurityServerIp")
	private String vodSecurityServerIp;
	@XmlElement(name="vodSecurityServerPort")
	private int vodSecurityServerPort;
	@XmlElement(name="vodPollingTime")
	private int vodPollingTime;
	
	@XmlElement(name="isEnableVodSecurity")
	private boolean isEnableVodSecurity;
	
	@XmlElement(name="movieServerUrl")
	private String movieServerUrl;
	
	@XmlElement(name="sharedMediaServerURL")
	private int sharedMediaServerURL;
	
	@XmlElement(name="playlistFile")
	private String playlistFile;
	
	@XmlElement(name="channelPropertyFile")
	private String channelPropertyFile;
	
	@XmlElement(name="channelListFetchUrl")
	private String channelListFetchUrl;
	
	@XmlElement(name="channelListFile")
	private String channelListFile;
	
	@XmlElement(name="isEnabledChannelAudioStreamFromScript")
	private boolean isEnabledChannelAudioStreamFromScript;
	
	@XmlElement(name="radioType")
	private String radioType;
	
	@XmlElement(name="radioServerURL")
	private String radioServerURL;
	
	@XmlElement(name="defaultSSID")
	private String defaultSSID;
	@XmlElement(name="digicastSSID")
	private String digicastSSID;
	
	@XmlElement(name="isNeedToGeneratePswd")
	private String isNeedToGeneratePswd;
	@XmlElement(name="defaultPswd")
	private String defaultPswd;
	@XmlElement(name="guestContentStreamPropertyFile")
	private String guestContentStreamPropertyFile;
	
	@XmlElement(name="isCursorEnabledAtLaunch")
	private boolean isCursorEnabledAtLaunch;
	@XmlElement
	private boolean isCursorEnabledAtSignIn;


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	
	public String getVodSecurityServerIp() {
		return vodSecurityServerIp;
	}
	public void setVodSecurityServerIp(String vodSecurityServerIp) {
		this.vodSecurityServerIp = vodSecurityServerIp;
	}
	public int getVodSecurityServerPort() {
		return vodSecurityServerPort;
	}
	public void setVodSecurityServerPort(int vodSecurityServerPort) {
		this.vodSecurityServerPort = vodSecurityServerPort;
	}
	public int getVodPollingTime() {
		return vodPollingTime;
	}
	public void setVodPollingTime(int vodPollingTime) {
		this.vodPollingTime = vodPollingTime;
	}
	public boolean isEnableVodSecurity() {
		return isEnableVodSecurity;
	}
	public void setEnableVodSecurity(boolean isEnableVodSecurity) {
		this.isEnableVodSecurity = isEnableVodSecurity;
	}
	public String getMovieServerUrl() {
		return movieServerUrl;
	}
	public void setMovieServerUrl(String movieServerUrl) {
		this.movieServerUrl = movieServerUrl;
	}
	public int getSharedMediaServerURL() {
		return sharedMediaServerURL;
	}
	public void setSharedMediaServerURL(int sharedMediaServerURL) {
		this.sharedMediaServerURL = sharedMediaServerURL;
	}
	public String getPlaylistFile() {
		return playlistFile;
	}
	public void setPlaylistFile(String playlistFile) {
		this.playlistFile = playlistFile;
	}
	public String getChannelPropertyFile() {
		return channelPropertyFile;
	}
	public void setChannelPropertyFile(String channelPropertyFile) {
		this.channelPropertyFile = channelPropertyFile;
	}
	public String getChannelListFetchUrl() {
		return channelListFetchUrl;
	}
	public void setChannelListFetchUrl(String channelListFetchUrl) {
		this.channelListFetchUrl = channelListFetchUrl;
	}
	public String getChannelListFile() {
		return channelListFile;
	}
	public void setChannelListFile(String channelListFile) {
		this.channelListFile = channelListFile;
	}
	public boolean isEnabledChannelAudioStreamFromScript() {
		return isEnabledChannelAudioStreamFromScript;
	}
	public void setEnabledChannelAudioStreamFromScript(boolean isEnabledChannelAudioStreamFromScript) {
		this.isEnabledChannelAudioStreamFromScript = isEnabledChannelAudioStreamFromScript;
	}
	public String getRadioType() {
		return radioType;
	}
	public void setRadioType(String radioType) {
		this.radioType = radioType;
	}
	public String getRadioServerURL() {
		return radioServerURL;
	}
	public void setRadioServerURL(String radioServerURL) {
		this.radioServerURL = radioServerURL;
	}
	public String getDefaultSSID() {
		return defaultSSID;
	}
	public void setDefaultSSID(String defaultSSID) {
		this.defaultSSID = defaultSSID;
	}
	public String getDigicastSSID() {
		return digicastSSID;
	}
	public void setDigicastSSID(String digicastSSID) {
		this.digicastSSID = digicastSSID;
	}
	public String getIsNeedToGeneratePswd() {
		return isNeedToGeneratePswd;
	}
	public void setIsNeedToGeneratePswd(String isNeedToGeneratePswd) {
		this.isNeedToGeneratePswd = isNeedToGeneratePswd;
	}
	public String getDefaultPswd() {
		return defaultPswd;
	}
	public void setDefaultPswd(String defaultPswd) {
		this.defaultPswd = defaultPswd;
	}
	public String getGuestContentStreamPropertyFile() {
		return guestContentStreamPropertyFile;
	}
	public void setGuestContentStreamPropertyFile(String guestContentStreamPropertyFile) {
		this.guestContentStreamPropertyFile = guestContentStreamPropertyFile;
	}
	public boolean isCursorEnabledAtLaunch() {
		return isCursorEnabledAtLaunch;
	}
	public void setCursorEnabledAtLaunch(boolean isCursorEnabledAtLaunch) {
		this.isCursorEnabledAtLaunch = isCursorEnabledAtLaunch;
	}
	public boolean isCursorEnabledAtSignIn() {
		return isCursorEnabledAtSignIn;
	}
	public void setCursorEnabledAtSignIn(boolean isCursorEnabledAtSignIn) {
		this.isCursorEnabledAtSignIn = isCursorEnabledAtSignIn;
	}
	public player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "player [type=" + type + ", driverId=" + driverId + ", connection=" + connection + ", scripts=" + scripts
				+ ", vodSecurityServerIp=" + vodSecurityServerIp + ", vodSecurityServerPort=" + vodSecurityServerPort
				+ ", vodPollingTime=" + vodPollingTime + ", isEnableVodSecurity=" + isEnableVodSecurity
				+ ", movieServerUrl=" + movieServerUrl + ", sharedMediaServerURL=" + sharedMediaServerURL
				+ ", playlistFile=" + playlistFile + ", channelPropertyFile=" + channelPropertyFile
				+ ", channelListFetchUrl=" + channelListFetchUrl + ", channelListFile=" + channelListFile
				+ ", isEnabledChannelAudioStreamFromScript=" + isEnabledChannelAudioStreamFromScript + ", radioType="
				+ radioType + ", radioServerURL=" + radioServerURL + ", defaultSSID=" + defaultSSID + ", digicastSSID="
				+ digicastSSID + ", isNeedToGeneratePswd=" + isNeedToGeneratePswd + ", defaultPswd=" + defaultPswd
				+ ", guestContentStreamPropertyFile=" + guestContentStreamPropertyFile + ", isCursorEnabledAtLaunch="
				+ isCursorEnabledAtLaunch + ", isCursorEnabledAtSignIn=" + isCursorEnabledAtSignIn + "]";
	}
	
	
	
	
//	connectionn +
	
	
	

}
