package com.aio.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.aio.bean.SysConfig;
import com.aio.common.Constant;
import com.aio.common.Decrypt;
import com.aio.exception.ConnectDBException;
import com.aio.service.SysConfigService;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.media.jfxmedia.logging.Logger;

@ParentPackage(value = "aio-default")
@Namespace("/")
public class IndexAction extends ActionSupport implements SessionAware {
	private String sysId;

	private Map<String, Object> session;

	@Autowired
	private SysConfigService sysConfigService;

	@Action(value = "index", results = { @Result(name = "success", location = "/WEB-INF/content/index.jsp") })
	public String execute() {
		if (sysId != null && !sysId.equals("")) {
			try {
				List<SysConfig> list = sysConfigService.getAllSysConfig();
				for (SysConfig tmp : list) {
					if (tmp.getId().equals(sysId)) {
						session.put("sysId", sysId);
						return SUCCESS;
					}
				}
			} catch (ConnectDBException e) {
				e.printStackTrace();
				return Constant.CONNECT_ERROR;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return Constant.PERMISSION_DENIED;

	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public Map<String, Object> getSession() {

		return session;

	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}