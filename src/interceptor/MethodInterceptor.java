package interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MethodInterceptor extends MethodFilterInterceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7749734427608227725L;
	Logger logger = (Logger)LogManager.getLogger();
	
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		//
				
		logger.info("方法拦截器启动");
		
		logger.info(invocation.getProxy().getActionName());
		
		return invocation.invoke();
		
	}

}
