package com.aio.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.aio.bean.XsCjAllTdkchView;
import com.aio.bean.XsXjbView;
import com.aio.bean.XsZpView;
import com.aio.exception.ConnectDBException;
import com.aio.exception.NullUserInfoException;
import com.aio.exception.NullUserScoreException;
import com.aio.service.QueryScoreService;
import com.aio.service.QueryUserInfoService;
import com.aio.service.QueryUserPhotoService;
import com.opensymphony.xwork2.ActionSupport;

import sun.misc.BASE64Encoder;

@ParentPackage(value = "aio-default")
@Namespace("/")
public class SysInitAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */

	private static final long serialVersionUID = 5042159433280864037L;

	private static final Logger logger = Logger.getLogger(SysInitAction.class.getName());

	@Autowired
	private QueryUserInfoService queryUserInfoService;

	@Autowired
	private QueryUserPhotoService queryUserPhotoService;

	@Autowired
	private QueryScoreService queryScoreService;

	private String xh;

	private Map<String, Object> result;

	@Action(value = "init", results = { @Result(name = "success", location = "/WEB-INF/content/content.jsp") })
	public String execute() {
		result = new HashMap<String, Object>();
		try {
			@SuppressWarnings("restriction")
			BASE64Encoder encoder = new BASE64Encoder();

			logger.info("--读取学生学籍信息开始--");
			XsXjbView xsXjbView = queryUserInfoService.getUserInfoByXh(xh);
			logger.info("--读取学生学籍信息正常结束,向result存放学籍信息--");
			result.put("XsXj", xsXjbView);

			logger.info("--读取学生照片信息开始");
			XsZpView xsZpView = queryUserPhotoService.getUserPhotoByXh(xh);
			if (xsZpView == null) {
				logger.warn("--读取学生照片信息结束，但学生照片数据为空,向session填空--");
				result.put("XsZp", "");
			} else {
				logger.info("--读取学生照片信息结束，向session存放照片信息");
				result.put("XsZp", encoder.encode(xsZpView.getZp()));
			}

			logger.info("--读取学生成绩开始--");
			List<XsCjAllTdkchView> list = queryScoreService.getCurrentScoresByXh(xh);
			logger.info("--读取学生成绩结束，向session存放成绩信息--");
			result.put("XsCj", list);

			logger.info("所有信息读取完毕，向session存入状态码:success");
			result.put("status", "success");
			return SUCCESS;

		} catch (NullUserInfoException e) {
			e.printStackTrace();
			return "404";

		} catch (NullUserScoreException e) {
			e.printStackTrace();
			return "404";
		} catch (ConnectDBException e) {
			e.printStackTrace();
			return "500";
		}
	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {

	}

}
