package action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HouseAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware,ServletRequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1725638051474259449L;
	
	private Map<String,Object> request;
	//页面不使用此值
	//故不需要设置setter和getter
	
	private Map<String,Object> session;
	
	
	private Map<String,Object> application;

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
