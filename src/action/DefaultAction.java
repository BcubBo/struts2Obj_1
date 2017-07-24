package action;

import com.opensymphony.xwork2.Action;

public class DefaultAction {
	

	
	public String add() {
		
		
		return "aa";
		
		
	}

	public String execute() throws Exception {
		
		System.out.println("自创建的execute方法");
		return "success";
	}
	
	

}
