package sg.edu.iss.ParkVisor.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CarparkOperator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int opId;
	@OneToMany(mappedBy="carparkOperator")
	private List<Carpark> carpark;
	private String opEmailAddr;
	private String opUsrM;
	private String opPw;
	public CarparkOperator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarparkOperator(int opId, List<Carpark> carpark, String opEmailAddr, String opUsrM, String opPw) {
		super();
		this.opId = opId;
		this.carpark = carpark;
		this.opEmailAddr = opEmailAddr;
		this.opUsrM = opUsrM;
		this.opPw = opPw;
	}
	public CarparkOperator(int opId, String opEmailAddr, String opUsrM, String opPw) {
		super();
		this.opId = opId;
		this.opEmailAddr = opEmailAddr;
		this.opUsrM = opUsrM;
		this.opPw = opPw;
	}
	public int getOpId() {
		return opId;
	}
	public void setOpId(int opId) {
		this.opId = opId;
	}
	public List<Carpark> getCarpark() {
		return carpark;
	}
	public void setCarpark(List<Carpark> carpark) {
		this.carpark = carpark;
	}
	public String getOpEmailAddr() {
		return opEmailAddr;
	}
	public void setOpEmailAddr(String opEmailAddr) {
		this.opEmailAddr = opEmailAddr;
	}
	public String getOpUsrM() {
		return opUsrM;
	}
	public void setOpUsrM(String opUsrM) {
		this.opUsrM = opUsrM;
	}
	public String getOpPw() {
		return opPw;
	}
	public void setOpPw(String opPw) {
		this.opPw = opPw;
	}
	
	
	
}
