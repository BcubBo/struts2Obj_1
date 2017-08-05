package interceptor;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import po.User;

public class Timerinterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Date begin = new Date();
		Logger logger = (Logger)LogManager.getLogger();
		String result = invocation.invoke();
		//位置顺序很重要
		Date end = new Date();


		logger.debug("interceptor进行了拦截总共method执行时间："+((end.getTime())-(begin.getTime())));
		
		return result;
	}

}
