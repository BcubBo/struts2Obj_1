package interceptor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LogInterceptor extends AbstractInterceptor {
	Logger logger = (Logger)LogManager.getLogger();

	
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		logger.debug("登陆拦截器启动");
		Object user = invocation.getInvocationContext().getSession().get("user");
		if(user!=null) {
			logger.debug("登陆后的user对象:"+user);
			String result = invocation.invoke();
			logger.debug("user对象存在，user非空验证拦截器语句结束");
			return result;

			//始终要将result进行返回
		}else {


			Object userpassword = invocation
					.getInvocationContext()
					.getParameters()
					.get("user.password");
			Object username = invocation
					.getInvocationContext()
					.getParameters()
					.get("user.username");
			logger.debug("外层user对象显示:"+userpassword+"\t"+username);
			if(userpassword == null && username == null) {
				logger.debug(userpassword+"\t"+username);
				invocation.
				getInvocationContext()
				.put("loginMsg","请先登录>>>>>");
				
				System.out.println("user非空判断内部");
				return "login";
				
				
				
				
			}else {
				logger.debug("登陆拦截器invoke方法调用之前，登陆后");
				String result = invocation.invoke();
				logger.debug("登陆拦截器invoke方法调用结束，登陆后");
				//始终要返回result
				return result;
				
			}
		
		}
	}
	
}
