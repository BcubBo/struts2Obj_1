package action;

import com.opensymphony.xwork2.ActionSupport;

public class Default1Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9208648536924068930L;

	@Override
	public String execute() throws Exception {
		System.out.println("继承了ActionSupport类");
		this.addActionMessage("HelloWorld!");
		
		return SUCCESS;
	}
	
	
	

}
