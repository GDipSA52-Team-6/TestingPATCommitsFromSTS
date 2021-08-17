package sg.edu.iss.ParkVisor.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CashCard {
	@Id
	private String can;
	@ManyToOne
	private User usr;
	private LocalDate issueD;
	private LocalDate expD;
	public CashCard() {
		super();
	}
	public CashCard(String can, User usr, LocalDate issueD, LocalDate expD) {
		super();
		this.can = can;
		this.usr = usr;
		this.issueD = issueD;
		this.expD = expD;
	}
	public CashCard(String can, LocalDate issueD, LocalDate expD) {
		super();
		this.can = can;
		this.issueD = issueD;
		this.expD = expD;
	}
	public String getCan() {
		return can;
	}
	public void setCan(String can) {
		this.can = can;
	}
	public User getUsr() {
		return usr;
	}
	public void setUsr(User usr) {
		this.usr = usr;
	}
	public LocalDate getIssueD() {
		return issueD;
	}
	public void setIssueD(LocalDate issueD) {
		this.issueD = issueD;
	}
	public LocalDate getExpD() {
		return expD;
	}
	public void setExpD(LocalDate expD) {
		this.expD = expD;
	}
	
	
	
	

}
