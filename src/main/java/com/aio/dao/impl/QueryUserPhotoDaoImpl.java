package com.aio.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.XsZpView;
import com.aio.dao.QueryUserPhotoDao;
import com.aio.exception.AioRuntimeException;

@Transactional
@Repository("queryUserPhotoDao")
public class QueryUserPhotoDaoImpl extends BaseDaoImpl<XsZpView, String> implements QueryUserPhotoDao {

	@Override
	public XsZpView getByXh(String xh) {
		try {
			XsZpView xsZpView = super.get(xh);
			return xsZpView;
		} catch (Exception e) {
			throw new AioRuntimeException(e);
		}
	}

}
