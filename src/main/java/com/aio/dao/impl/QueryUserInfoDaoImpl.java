package com.aio.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.XsXjbView;
import com.aio.dao.QueryUserInfoDao;
import com.aio.exception.AioRuntimeException;

@Transactional
@Repository("queryUserInfoDao")
public class QueryUserInfoDaoImpl extends BaseDaoImpl<XsXjbView, String> implements QueryUserInfoDao {
	@Override
	public XsXjbView getByXh(String xh) {
		try {
			XsXjbView xsXjbView = super.get(xh);
			return xsXjbView;
		} catch (Exception e) {
			throw new AioRuntimeException(e);
		}
	}

}
