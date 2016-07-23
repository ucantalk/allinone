package com.aio.interceptor;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.aio.common.Constant;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class BaseInterceptor extends AbstractInterceptor {
	private static final Logger logger = Logger.getLogger(BaseInterceptor.class.getName());
	private String sessionKeyUid;
	private String sessionKeySid;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String actionName = invocation.getProxy().getActionName();
		String method = ServletActionContext.getRequest().getMethod();
		boolean isPostMethod = "POST".equalsIgnoreCase(method);
		if (!isPostMethod) {
			logger.error("--参数提交方式Get,禁止访问!主机地址:" + ServletActionContext.getRequest().getRemoteAddr());
			return Constant.PERMISSION_DENIED;
		}
		if (actionName.equals("index")) {
			logger.info("--拦截器加载，拦截动作：" + actionName + "--");
			logger.info("跳转到首页");
			return invocation.invoke();
		}
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		logger.info("--拦截器加载，拦截动作：" + actionName + "--");
		if (session.get(sessionKeySid) != null) {
			if (session.get(sessionKeyUid) != null) {
				return invocation.invoke();
			} else {
				logger.error("无效会话信息，跳转到首页");
				return "index";
			}
		} else {
			logger.error("无效访问权限，跳转到401.4");
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
