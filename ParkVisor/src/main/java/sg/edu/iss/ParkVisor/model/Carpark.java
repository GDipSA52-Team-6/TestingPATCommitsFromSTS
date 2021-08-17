package sg.edu.iss.ParkVisor.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Carpark {

	@Id
	private int carparkId;
	
	@ManyToOne
	private CarparkOperator carparkOperator;
	private String carparkM;
	private String mallAddr;
	private String coord;
	private String area;
	private int totalLots;
	private String heightRestriction;
	private String layoutUrl;
	private String mallOptingHrs;
	private String gracePeriod;
	private String rateOvr;
	@OneToMany(mappedBy="carpark")
	private List<CarparkPrediction> carparkPrediction;
	@OneToMany(mappedBy="carpark")
	private List<Rate> rate;
	
	public Carpark() {
		super();
	}
	
	

	public Carpark(int carparkId, CarparkOperator carparkOperator, String carparkM, String mallAddr, String coord,
			String area, int totalLots, String heightRestriction, String layoutUrl, String mallOptingHrs,
			String gracePeriod, String rateOvr, List<CarparkPrediction> carparkPrediction, List<Rate> rate) {
		super();
		this.carparkId = carparkId;
		this.carparkOperator = carparkOperator;
		this.carparkM = carparkM;
		this.mallAddr = mallAddr;
		this.coord = coord;
		this.area = area;
		this.totalLots = totalLots;
		this.heightRestriction = heightRestriction;
		this.layoutUrl = layoutUrl;
		this.mallOptingHrs = mallOptingHrs;
		this.gracePeriod = gracePeriod;
		this.rateOvr = rateOvr;
		this.carparkPrediction = carparkPrediction;
		this.rate = rate;
	}



	public Carpark(int carparkId, String carparkM, String mallAddr, String coord, String area, int totalLots,
			String heightRestriction, String layoutUrl, String mallOptingHrs, String gracePeriod, String rateOvr) {
		super();
		this.carparkId = carparkId;
		this.carparkM = carparkM;
		this.mallAddr = mallAddr;
		this.coord = coord;
		this.area = area;
		this.totalLots = totalLots;
		this.heightRestriction = heightRestriction;
		this.layoutUrl = layoutUrl;
		this.mallOptingHrs = mallOptingHrs;
		this.gracePeriod = gracePeriod;
		this.rateOvr = rateOvr;
	}
	public int getCarparkId() {
		return carparkId;
	}
	public void setCarparkId(int carparkId) {
		this.carparkId = carparkId;
	}
	public CarparkOperator getCarparkOperator() {
		return carparkOperator;
	}
	public void setCarparkOperator(CarparkOperator carparkOperator) {
		this.carparkOperator = carparkOperator;
	}
	public String getCarparkM() {
		return carparkM;
	}
	public void setCarparkM(String carparkM) {
		this.carparkM = carparkM;
	}
	public String getMallAddr() {
		return mallAddr;
	}
	public void setMallAddr(String mallAddr) {
		this.mallAddr = mallAddr;
	}
	public String getCoord() {
		return coord;
	}
	public void setCoord(String coord) {
		this.coord = coord;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getTotalLots() {
		return totalLots;
	}
	public void setTotalLots(int totalLots) {
		this.totalLots = totalLots;
	}
	public String getHeightRestriction() {
		return heightRestriction;
	}
	public void setHeightRestriction(String heightRestriction) {
		this.heightRestriction = heightRestriction;
	}
	public String getLayoutUrl() {
		return layoutUrl;
	}
	public void setLayoutUrl(String layoutUrl) {
		this.layoutUrl = layoutUrl;
	}
	public String getMallOptingHrs() {
		return mallOptingHrs;
	}
	public void setMallOptingHrs(String mallOptingHrs) {
		this.mallOptingHrs = mallOptingHrs;
	}
	public String getGracePeriod() {
		return gracePeriod;
	}
	public void setGracePeriod(String gracePeriod) {
		this.gracePeriod = gracePeriod;
	}
	public String getRateOvr() {
		return rateOvr;
	}
	public void setRateOvr(String rateOvr) {
		this.rateOvr = rateOvr;
	}

	public List<CarparkPrediction> getCarparkPrediction() {
		return carparkPrediction;
	}

	public void setCarparkPrediction(List<CarparkPrediction> carparkPrediction) {
		this.carparkPrediction = carparkPrediction;
	}



	public List<Rate> getRate() {
		return rate;
	}



	public void setRate(List<Rate> rate) {
		this.rate = rate;
	}
	
	
	
	
}
