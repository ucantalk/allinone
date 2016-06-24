package com.aio.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class BaseInterceptor extends AbstractInterceptor {
	private String sessionKeyUid;
	private String sessionKeySid;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String actionName = invocation.getProxy().getActionName();
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
			return "401.4";
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
