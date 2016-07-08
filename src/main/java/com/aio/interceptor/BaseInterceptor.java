package com.aio.interceptor;

import java.util.Map;

import org.apache.log4j.Logger;

import com.aio.action.SysInitAction;
import com.aio.common.Constant;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;



public class BaseInterceptor extends AbstractInterceptor {
	private static final Logger logger = Logger.getLogger(SysInitAction.class.getName());
	private String sessionKeyUid;
	private String sessionKeySid;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String actionName = invocation.getProxy().getActionName();
		logger.info("--拦截器加载，拦截动作：" + actionName + "--");
		if (actionName.equals("index")) {
			return invocation.invoke();
		}
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		if (session.get(sessionKeySid) != null) {
			if (session.get(sessionKeyUid) != null) {
				return invocation.invoke();
			} else {
				return "index";
			}
		} else {
			return Constant.PERMISSION_DENIED;
		}
	}

	public String getSessionKeyUid() {
		return sessionKeyUid;
	}

	public void setSessionKeyUid(String sessionKeyUid) {
		this.sessionKeyUid = sessionKeyUid;
	}

	public String getSessionKeySid() {
		return sessionKeySid;
	}

	public void setSessionKeySid(String sessionKeySid) {
		this.sessionKeySid = sessionKeySid;
	}

}
