package po;

import java.util.Date;

public class House {
	
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private String title;//信息标题
	private Date  addDate;//信息发布时间
	private HouseType houseType;//房屋类型
	private double price;//价格
	private Street street;
	private District district;
	private User user;
	
	
	
	public House() {
		super();
	}//无参数构造
	public User getUser() {
		return user;
	}
	//有参构造
	public House(String title, Date addDate, HouseType houseType, double price, Street street, District district,
			User user) {
		super();
		this.title = title;
		this.addDate = addDate;
		this.houseType = houseType;
		this.price = price;
		this.street = street;
		this.district = district;
		this.user = user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	////
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public HouseType getHouseType() {
		return houseType;
	}
	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Street getStreet() {
		return street;
	}
	public void setStreet(Street street) {
		this.street = street;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	
	

}
