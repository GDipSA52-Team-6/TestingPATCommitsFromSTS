package sg.edu.iss.ParkVisor.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class CarparkPrediction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int predId;

@ManyToOne
private Carpark carpark;
private LocalDate predD;
private int avgOcc;
public CarparkPrediction() {
	super();
}
public CarparkPrediction(int predId, Carpark carpark, LocalDate predD, int avgOcc) {
	super();
	this.predId = predId;
	this.carpark = carpark;
	this.predD = predD;
	this.avgOcc = avgOcc;
}
public int getPredId() {
	return predId;
}
public void setPredId(int predId) {
	this.predId = predId;
}
public Carpark getCarpark() {
	return carpark;
}
public void setCarpark(Carpark carpark) {
	this.carpark = carpark;
}
public LocalDate getPredD() {
	return predD;
}
public void setPredD(LocalDate predD) {
	this.predD = predD;
}
public int getAvgOcc() {
	return avgOcc;
}
public void setAvgOcc(int avgOcc) {
	this.avgOcc = avgOcc;
}




}
