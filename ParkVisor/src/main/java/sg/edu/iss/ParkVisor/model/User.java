package sg.edu.iss.ParkVisor.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usrId;
	private String usrEmailAddr;
	private String usrM;
	private String usrPw;
	
	@OneToMany(mappedBy="usr")
	private List<CashCard> cashCard;
	public User() {
		super();
	}
	
	public User(int usrId, String usrEmailAddr, String usrM, String usrPw) {
		super();
		this.usrId = usrId;
		this.usrEmailAddr = usrEmailAddr;
		this.usrM = usrM;
		this.usrPw = usrPw;
	}

	public User(int usrId, String usrEmailAddr, String usrM, String usrPw, List<CashCard> cashCard) {
		super();
		this.usrId = usrId;
		this.usrEmailAddr = usrEmailAddr;
		this.usrM = usrM;
		this.usrPw = usrPw;
		this.cashCard = cashCard;
	}
	public int getUsrId() {
		return usrId;
	}
	public void setUsrId(int usrId) {
		this.usrId = usrId;
	}
	public String getUsrEmailAddr() {
		return usrEmailAddr;
	}
	public void setUsrEmailAddr(String usrEmailAddr) {
		this.usrEmailAddr = usrEmailAddr;
	}
	public String getUsrM() {
		return usrM;
	}
	public void setUsrM(String usrM) {
		this.usrM = usrM;
	}
	public String getUsrPw() {
		return usrPw;
	}
	public void setUsrPw(String usrPw) {
		this.usrPw = usrPw;
	}
	public List<CashCard> getCashCard() {
		return cashCard;
	}
	public void setCashCard(List<CashCard> cashCard) {
		this.cashCard = cashCard;
	}
	
	
	
	

}
