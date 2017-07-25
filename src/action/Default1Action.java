package action;

import com.opensymphony.xwork2.Action;

public class Default1Action implements Action {

	/**
	 * 
	 */

	@Override
	public String execute() throws Exception {

		
		if(true) {
			throw new RuntimeException("测试抛出的异常进行捕获");
			}
		
		System.out.println("实现了Action类");
		return SUCCESS;

	}
	
	
	

}
