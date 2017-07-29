package po;

public class Street {

	private int streetId;
	private String streetName;
	private District district;//所在地区
	public int getStreetId() {
		return streetId;
	}
	public void setStreetId(int streetId) {
		this.streetId = streetId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public Street(int streetId, String streetName, District district) {
		super();
		this.streetId = streetId;
		this.streetName = streetName;
		this.district = district;
	}
	public Street() {
		super();
	}
	
	
		
	
}
