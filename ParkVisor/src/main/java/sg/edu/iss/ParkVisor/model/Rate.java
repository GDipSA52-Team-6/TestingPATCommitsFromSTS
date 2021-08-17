package sg.edu.iss.ParkVisor.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rateId;
	@ManyToOne
	private Carpark carpark;
	private Days dayFrom;
	private Days dayTo;
	private String timeFrom;
	private String timeTo;
	
	@Enumerated(EnumType.STRING)
	private FixedRateType fixedRateType;
	private double frValue;
	@Enumerated(EnumType.STRING)
	private VariableRateType variableRateType;
	private double vrValue;
	public Rate() {
		super();
	}
	public Rate(int rateId, Carpark carpark, Days dayFrom, Days dayTo, String timeFrom, String timeTo,
			FixedRateType fixedRateType, double frValue, VariableRateType variableRateType, double vrValue) {
		super();
		this.rateId = rateId;
		this.carpark = carpark;
		this.dayFrom = dayFrom;
		this.dayTo = dayTo;
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
		this.fixedRateType = fixedRateType;
		this.frValue = frValue;
		this.variableRateType = variableRateType;
		this.vrValue = vrValue;
	}
	public int getRateId() {
		return rateId;
	}
	public void setRateId(int rateId) {
		this.rateId = rateId;
	}
	public Carpark getCarpark() {
		return carpark;
	}
	public void setCarpark(Carpark carpark) {
		this.carpark = carpark;
	}
	public Days getDayFrom() {
		return dayFrom;
	}
	public void setDayFrom(Days dayFrom) {
		this.dayFrom = dayFrom;
	}
	public Days getDayTo() {
		return dayTo;
	}
	public void setDayTo(Days dayTo) {
		this.dayTo = dayTo;
	}
	public String getTimeFrom() {
		return timeFrom;
	}
	public void setTimeFrom(String timeFrom) {
		this.timeFrom = timeFrom;
	}
	public String getTimeTo() {
		return timeTo;
	}
	public void setTimeTo(String timeTo) {
		this.timeTo = timeTo;
	}
	public FixedRateType getFixedRateType() {
		return fixedRateType;
	}
	public void setFixedRateType(FixedRateType fixedRateType) {
		this.fixedRateType = fixedRateType;
	}
	public double getFrValue() {
		return frValue;
	}
	public void setFrValue(double frValue) {
		this.frValue = frValue;
	}
	public VariableRateType getVariableRateType() {
		return variableRateType;
	}
	public void setVariableRateType(VariableRateType variableRateType) {
		this.variableRateType = variableRateType;
	}
	public double getVrValue() {
		return vrValue;
	}
	public void setVrValue(double vrValue) {
		this.vrValue = vrValue;
	}
	
	
	
	
}
