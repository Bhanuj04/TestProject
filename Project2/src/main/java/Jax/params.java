package Jax;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
@XmlAccessorType(XmlAccessType.FIELD)
public class params {
	
	@XmlElement(name="param")
	private List<param> param;

	public List<param> getParamm() {
		return param;
	}

	public void setParamm(List<param> param) {
		this.param = param;
	}

	public params() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "params [paramm=" + param + "]";
	}
	
	
	
	
//	@XmlElementWrapper(name="params")
//	@XmlElement(name="param")
//	private List<String> param;
//
//	public List<String> getParams() {
//		return param;
//	}
//
//	public void setParams(List<String> params) {
//		this.param = params;
//	}
//
//	@Override
//	public String toString() {
//		return "params [params=" + param + "]";
//	}
//
//	public params() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
	
	

////	@XmlAttribute(name="type")
////	private String typee; 
//	
//	
//	
//	
////	@XmlElement(name="param")
////	private List<param> parmmm;
//	
//	
//	
//
//	@XmlAttribute(name="")
//	private String type;
//////	
////	
//	public List<param>Param() {
//		return paramm;
//	}
//
//	
//	
//	public params() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//
//
//	public String getTye() {
//		return typee;
//	}
//
//
//
//	public void setTye(String tye) {
//		this.typee = tye;
//	}
//
//
//
//	public List<param> getParmm() {
//		return parmmm;
//	}
//
//
//
//	public void setParmm(List<param> parmm) {
//		this.parmmm = parmm;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "params [parmmm=" + parmmm + "]";
//	
//
//
//
//	
//	
//	
//
//}



//	@Override
//	public String toString() {
//		return "params [param=" + parmm + "]";
//	}
	
	
	
	
}	
	

