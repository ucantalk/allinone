package com.aio.dao;

import java.sql.SQLException;
import java.util.List;

import com.aio.bean.XsCjAllTdkchView;

public interface QueryScoreDao {

	public List<XsCjAllTdkchView> getByXh(String xh) throws SQLException;

}
