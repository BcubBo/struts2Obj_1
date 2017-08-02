package action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import po.District;
import po.House;
import po.HouseType;
import po.Street;
import util.Cache;
public class HouseAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware,ServletRequestAware {

	/**
	 * 
	 */
	private Integer districtId;
	private Integer streetId;
	private Integer id;
	private House house;
	
	private static final long serialVersionUID = -1725638051474259449L;
	
	private Map<String,Object> request;
	//页面不使用此值
	//故不需要设置setter和getter
	private List<House> houses = new ArrayList<House>();
	
	private Map<String,Object> session;
	
	
	private Map<String,Object> application;
	
	private Logger logger  = (Logger)LogManager.getLogger();
	/////////////////////
	
	
	
	
	



	
	////
	public String add() {
		//标题ok
		//房屋类型的选择
		this.houses = Cache.houses;
		int houseTypeId = house.getHouseType().getTypeId();
		logger.debug(houseTypeId+":<<<<<<<<<<<<<<<<");
		for(HouseType ht :Cache.houseTypes) {
			
			
			if(ht.getTypeId()==houseTypeId) {
				
				
				house.setHouseType(ht);
				logger.debug(ht.getTypeName()+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<HouseTypeName");
				break;
			}
		}
		//位置信息
		//districtId,streetId
		
		for(Street st:Cache.streets) {
			if(st.getStreetId()==streetId) {
				house.setStreet(st);
			}

		}
		for(District dt:Cache.districts) {
			
			if(dt.getDistrictId()==(int)districtId) {
				
				house.getStreet().setDistrict(dt);
				logger.debug(dt.getDistrictName()+":<<<<<<<<<");
				break;
			}
			
			

		}
//	
		house.setUser(Cache.houses.get(3).getUser());
		house.setId(1111);
		house.setStreet(Cache.houses.get(3).getStreet());
		house.setAddDate(new Date());
		house.setHouseType(Cache.houses.get(3).getHouseType());
		house.setDistrict(Cache.houses.get(3).getDistrict());
		house.setHouseType(Cache.houses.get(3).getHouseType());
		

		houses.add(house);
		logger.debug("房屋的长度\t"+houses.size());
		return "add";
		
		
		
	}
	
	////
	public String list() {
		
		this.houses = Cache.houses;
		System.out.println("HouseAction中\t"+Cache.houses.size());
		ActionContext ac = ActionContext.getContext();
		logger.debug("房屋的长度\t"+houses.size());
		
		return "list";
		
		
	}
	////
	
	public String view() {
		for(House h:Cache.houses) {
			
			
			if(h.getId().equals(id)) {
				//此为equals的原因为导入的是字符串所以用integer接收的时候要进行字符串的比较而不能简单的进行==的比较
				this.house = h;
				break;
				
				
				
			}
			
			
			
		}
		logger.debug("view方法中Cache.houses的数量:"+Cache.houses.size());
		return "view";
		
		
	}
	public String update() {
		
		
		return "update_success";
	}
	////
	public String delete() {
		
		return "delete_success";
		
		
		
	}

	public List<House> getHouses() {
		return houses;
	}

	public void setHouses(List<House> houses) {
		this.houses = houses;
	}
	


	
	public House getHouse() {
		return house;
	}

	public Integer getStreetId() {
		return streetId;
	}

	public void setStreetId(Integer streetId) {
		this.streetId = streetId;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		
		request.put("user", "testUser");
		application.put("app", "testApp");
		session.put("session", "testSession");
		//第三种
		
		ServletActionContext.getRequest().getContextPath();
		//解耦和
		
		
		return SUCCESS;
	}//

	@Override
	public void setRequest(Map<String, Object> request) {
		
		this.request=request;
		
		
		
		
	}//

	@Override
	public void setSession(Map<String, Object> session) {
			
		this.session = session;
		
		
		
	}//

	@Override
	public void setApplication(Map<String, Object> application) {
		
		this.application = application;
		
	}
	//

	@Override
	public void setServletRequest(HttpServletRequest request) {
			
		//和servletAPI进行了耦合
		
		request.setAttribute("servlet","testServlet");
		
		
		
	}

}
