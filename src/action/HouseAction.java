package action;

import java.util.ArrayList;
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

import com.opensymphony.xwork2.ActionSupport;

import po.House;
import util.Cache;
public class HouseAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware,ServletRequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1725638051474259449L;
	
	private Map<String,Object> request;
	//页面不使用此值
	//故不需要设置setter和getter
	private List<House> houses = new ArrayList<House>();
	
	private Map<String,Object> session;
	
	
	private Map<String,Object> application;
	
	private Logger logger  = (Logger)LogManager.getLogger();

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
	
	////
	public String add() {
		
		
		return "add_success";
		
		
		
	}
	
	////
	public String list() {
		
		this.houses = Cache.houses;
		System.out.println("HouseAction中\t"+Cache.houses.size());
		logger.debug("房屋的长度\t"+houses.size());
		
		
		return "list";
		
		
	}
	////
	
	public String view() {
		
		
		return "view_success";
		
		
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
	
	

}
