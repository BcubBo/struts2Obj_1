package action;

import com.opensymphony.xwork2.ActionSupport;

import po.House;
import po.User;
import util.Cache;

public class JsonAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2601082842813197588L;
	
	private User user;
	private House house;
	
	public String execute() {
		
		user = Cache.users.get(0);
		
		house = Cache.houses.get(0);
		
		return SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public House getHouse() {
		return house;
	}



























	public void setHouse(House house) {
		this.house = house;
	}



























	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
