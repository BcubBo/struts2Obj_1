package interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LogInterceptor extends AbstractInterceptor {
	Logger logger = (Logger)LogManager.getLogger();
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("登陆拦截器启动");
		Object userpassword = invocation.getInvocationContext().getParameters().get("user.password");
		Object username = invocation.getInvocationContext().getParameters().get("user.username");
		logger.debug("外层user对象显示:"+userpassword+"\t"+username);
		if(userpassword == null && username == null) {
			logger.debug(userpassword+"\t"+username);
			invocation.getInvocationContext().put("loginMsg","请先登录");
			System.out.println("user非空判断内部");
			return "login";
			
			
			
			
		}else {

			logger.info("LogInterceptor启动");
			
			String result = invocation.invoke();
			logger.debug(invocation.getInvocationContext().getSession().get("user"));
			logger.info("LogInterceptor结束");
			return result;
		}
		
		
	}

}
