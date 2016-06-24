package com.aio.service.impl;

import java.sql.SQLException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aio.bean.XsZpView;
import com.aio.dao.QueryUserPhotoDao;
import com.aio.exception.ConnectDBException;
import com.aio.service.QueryUserPhotoService;

@Transactional
@Service("queryUserPhotoService")
public class QueryUserPhotoServiceImpl implements QueryUserPhotoService {

	@Autowired
	private QueryUserPhotoDao queryUserPhotoDao;

	@Override
	public XsZpView getUserPhotoByXh(String xh) throws ConnectDBException {
		XsZpView xsZpView;
		try {
			xsZpView = queryUserPhotoDao.getByXh(xh);
			if (xsZpView == null) {
				return null;
			}
			return xsZpView;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ConnectDBException("连接数据库失败或者查询数据出错");
		}

	}

}
