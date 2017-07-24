package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import po.User;

public class UserBeanAction extends ActionSupport {
	
	private User user;

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

	@Override
	public String execute() throws Exception {

		
		System.out.println(this.getUser().getUsername()+"\n"+this.getUser().getPassword());
		boolean flag = false;
		//要处理的代码
		if(user.getUsername().equals("bcubbo")&&user.getPassword().equals("bcubbo")) {
			flag =true;
			ActionContext ac = ActionContext.getContext();
			//获取动作上下文
		Map<String,Object> result = ac.getSession();
		result.put("user", this.user);
		
			
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
		
		return "delete_success";
		
		
		
	}////
	
	public String update() {
		
		return "update_success";
		
		
		
	}
	
	

}
