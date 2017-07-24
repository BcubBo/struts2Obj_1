package action;

import com.opensymphony.xwork2.ModelDriven;

import po.User;

public class ModelDrivenBeanAction implements ModelDriven {
	private User user;
	@Override
	public Object getModel() {
		
		
		user = new User("bcubbo","bcubbo","bcubbo@bcubbo.tv");
		return user;
		
	}
	public String execute() {
		
		
		return "success";
		
		
	}

}
