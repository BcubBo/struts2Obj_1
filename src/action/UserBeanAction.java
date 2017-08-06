package action;

import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import po.User;

public class UserBeanAction extends ActionSupport {
	
	private User user;
	private Date date;
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 8273548157105774477L;
	public void validate() {
		
		if(user.getUsername() ==null || user.getPassword() == null) {
			
			this.addFieldError("user.username","请输入账户名称");
			
			this.addFieldError("user.password", "请输入密码");
			
			
		}
		
		
		
	}
	@Override
	public String execute() throws Exception {

/*		if(true) {
			
			return "error";
			
			
		}*/
		System.out.println(this.getUser().getUsername()+"\n"+this.getUser().getPassword());
		boolean flag = false;
		//要处理的代码
		if(user.getUsername().equals("bcubbo")&&user.getPassword().equals("bcubbo")) {
			flag =true;
			ActionContext ac = ActionContext.getContext();
			//获取动作上下文
			//将对象放入到session中
		Map<String,Object> result = ac.getSession();
		result.put("user", this.user);
		
		//获取request
		
		@SuppressWarnings("unchecked")
		Map<String,Object> request = (Map<String,Object>)ac.get("request");
		////
		
		request.put("user",user);
		
		date = new Date();
		
		
			
		}
		if(flag) {
			return SUCCESS;
		}
		else {
			return INPUT;
		}
	}//
	
	public String add() {
		System.out.println("使用动态方法进行方法调用，调用add方法，添加成功");
		return "add_success";
		
		
		
	}///
	public String delete() {
		System.out.println("动态调用方法，delete方法调用成功");
		return "delete_success";
		
		
		
	}////
	
	public String update() {
		System.out.println("动态调用方法，update方法调用成功");
		return "update_success";
		
		
		
	}
	
	

}
