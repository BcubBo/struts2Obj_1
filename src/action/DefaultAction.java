package action;

import com.opensymphony.xwork2.Action;

public class DefaultAction {
	
	private String t;
	
	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}
////
	
	
	//表示返回的具体名称
	private String rs;
	
	
	public String getRs() {
		return rs;
	}

	public void setRe(String rs) {
		this.rs = rs;
	}

	public String add() {
		
		
		return "aa";
		
		
	}

	public String execute() throws Exception {
		if(t.equals("1")){
			
			rs="/jsp/index1.jsp";
			
			
			
		}else {
			
			rs="/jsp/index.jsp";
			
			
		}
		System.out.println("自创建的execute方法");
		return "success";
	}
	
	

}
