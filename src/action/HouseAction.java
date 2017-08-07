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
		int houseTypeId = 0;
		if(house!=null) {
/*		logger.debug(houseTypeId+"<<<<房屋类型id");*/
			houseTypeId = house.getHouseType().getTypeId();
		for(HouseType ht :Cache.houseTypes) {
			
			
			if(ht.getTypeId()==houseTypeId) {
				
				
				house.setHouseType(ht);
/*				logger.debug(ht.getTypeName()+"<<<<<<房屋类型名称");*/
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
/*				logger.debug(dt.getDistrictName()+"<<<区域名称");*/
				break;
			}
			
			

		}
//	
		house.setUser(Cache.houses.get(3).getUser());
		house.setId(1111);
		house.setStreet(Cache.houses.get(3).getStreet());
		house.setAddDate(new Date());
		house.setDistrict(Cache.houses.get(3).getDistrict());
		

		houses.add(house);
/*		logger.debug("房屋的长度\t"+houses.size());
		logger.debug("走到add方法返回值前边");*/
		}
		return "add";
		
		
		
	}
	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		//super.validate();
		logger.debug("house对象的值为:"+house);
		if(house!=null && house.getTitle().length()==0 ) {
			
				this.addActionError("HouseAction校验器校验>请重新输入");//始终添加错误
				this.addFieldError("house.title", "标题不能为空");//始终添加错误，无法跳转
				//添加addActionError
				logger.debug("validate内部设置的报错位置");
			
		}
	
		
		
		
	}
	////////validate方法
	public void validateAdd() {
		
		if(house!=null && house.getTitle().length()==0) {
			
			this.addActionError("单一方法校验，validateAdd请重新输入！");
			this.addFieldError("house.title","validateAdd方法校验，标题不可为空");
			logger.debug("validateAdd方法验证");
			
		}
				
		
	}
	
	
	
	
	
	////
	public String list() {
		
		this.houses = Cache.houses;
		System.out.println("HouseAction中\t"+Cache.houses.size());
		ActionContext ac = ActionContext.getContext();
/*		logger.debug("房屋的长度\t"+houses.size());
		logger.debug("走到list方法返回值前边");*/
		//标题ok
		//房屋类型的选择
		this.houses = Cache.houses;
		int houseTypeId = 0;
		if(house!=null) {
			 houseTypeId = house.getHouseType().getTypeId();
				for(HouseType ht :Cache.houseTypes) {
					
					
					if(ht.getTypeId()==houseTypeId) {
						
						
						house.setHouseType(ht);
		/*				logger.debug(ht.getTypeName()+"<<<<<<房屋类型名称");*/
						break;
					}
				}
				//位置信息
				//districtId,streetId
				
				for(Street st:Cache.streets) {
					if(st.getStreetId()==streetId ) {
						house.setStreet(st);
					}

				}
				for(District dt:Cache.districts) {
					
					if(dt.getDistrictId()==(int)districtId ) {
						
						house.getStreet().setDistrict(dt);
		/*				logger.debug(dt.getDistrictName()+"<<<区域名称");*/
						break;
					}
					
					

				}
		//	
				house.setUser(Cache.houses.get(3).getUser());
				house.setId(1111);
				house.setStreet(Cache.houses.get(3).getStreet());
				house.setAddDate(new Date());
				house.setDistrict(Cache.houses.get(3).getDistrict());
				

				houses.add(house);
		/*		logger.debug("房屋的长度\t"+houses.size());
				logger.debug("走到add方法返回值前边");*/			 
		}
/*		logger.debug(houseTypeId+"<<<<房屋类型id");*/

			
		return "list";
		
		
	}
	////
	
	public String view() {
		logger.debug(Cache.houses.size());
		for(House h:Cache.houses) {
			
			
			if(h.getId().equals(id)) {
				//此为equals的原因为导入的是字符串所以用integer接收的时候要进行字符串的比较而不能简单的进行==的比较
				this.house = h;
				break;
				
				
				
			}
			
			
			
		}
		logger.debug("view方法中Cache.houses的数量:"+Cache.houses.size());
		
		logger.debug("走到view方法返回值前边");
		return "view";
		
		
	}
	public String update() {
		
		logger.debug("走到update方法返回值前边");
		return "input";
	}
	////
	public String delete() {
		logger.debug("走到delete方法返回值前边");
		return "delete_success";
		
		
		
	}



	@Override
	public String execute() throws Exception {
		
		request.put("user", "testUser");
		application.put("app", "testApp");
		session.put("session", "testSession");
		//第三种
		
		ServletActionContext.getRequest().getContextPath();
		//解耦和
		
		logger.debug("走到excute方法返回值前边");
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
}
