package com.aio.dao;

import java.sql.SQLException;

import com.aio.bean.XsZpView;

public interface QueryUserPhotoDao {

	public XsZpView getByXh(String xh) throws SQLException;

}
