package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5588374487038737901L;

	public String execute() {
		System.out.println(username+"\n"+password);
		boolean flag = false;
		//要处理的代码
		if(username.equals("bcubbo")&&password.equals("bcubbo")) {
			flag =true;
			ActionContext ac = ActionContext.getContext();
			//获取动作上下文
		Map<String,Object> result = ac.getSession();
		result.put("user", this.username);
		result.put("password", password);
			
		}
		if(flag)
			return SUCCESS;
		else
			return INPUT;
		
		
	}

}
