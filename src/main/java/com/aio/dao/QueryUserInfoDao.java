package com.aio.dao;

import java.sql.SQLException;

import com.aio.bean.XsXjbView;

public interface QueryUserInfoDao {

	public XsXjbView getByXh(String xh);
}
