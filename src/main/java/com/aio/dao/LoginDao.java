package com.aio.dao;

import java.sql.SQLException;

import com.aio.bean.SysYhmmbView;

public interface LoginDao {

	public SysYhmmbView getById(String id) throws SQLException;

}
