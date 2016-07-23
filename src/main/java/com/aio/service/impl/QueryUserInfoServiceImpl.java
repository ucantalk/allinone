package com.aio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.XsXjbView;
import com.aio.dao.QueryUserInfoDao;
import com.aio.exception.AioRuntimeException;
import com.aio.exception.ConnectDBException;
import com.aio.exception.NullUserInfoException;
import com.aio.service.QueryUserInfoService;

@Transactional
@Service("queryUserInfoService")
public class QueryUserInfoServiceImpl implements QueryUserInfoService {

	@Autowired
	private QueryUserInfoDao queryUserInfoDao;

	@Override
	public XsXjbView getUserInfoByXh(String xh) throws NullUserInfoException, ConnectDBException {
		try {
			XsXjbView xsXjbView = queryUserInfoDao.getByXh(xh);
			if (xsXjbView != null) {
				xsXjbView.setYwxb(xsXjbView.getXb() != null && xsXjbView.getXb() != "" && xsXjbView.getXb().equals("女")
						? "female" : "male");
				return xsXjbView;
			}
			throw new NullUserInfoException("读取学生信息出错:无此学生");
		} catch (AioRuntimeException e) {
			throw new ConnectDBException("连接数据库失败或者查询数据出错");

		}
	}

}
