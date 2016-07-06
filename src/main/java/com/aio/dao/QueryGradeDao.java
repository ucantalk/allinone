package com.aio.dao;

import java.sql.SQLException;
import java.util.List;

import com.aio.bean.XsCjAllTdkchView;

public interface QueryGradeDao {

	public List<Object> getByXh(String xh) throws SQLException;

}
