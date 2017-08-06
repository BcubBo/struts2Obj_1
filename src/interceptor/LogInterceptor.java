package interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LogInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
/*		invocation.getInvocationContext().getSession().get("user");*/
		Logger logger = (Logger)LogManager.getLogger();
		logger.info("LogInterceptor启动");
		String result = invocation.invoke();
		logger.info("LogInterceptor结束");
		
		
		return result;
	}

}
