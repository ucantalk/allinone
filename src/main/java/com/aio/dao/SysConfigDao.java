package com.aio.dao;

import java.sql.SQLException;
import java.util.List;

import com.aio.bean.SysConfig;

public interface SysConfigDao {

	public List<SysConfig> getAll() throws SQLException;

	public String saveAll(SysConfig s) throws SQLException;

	public int delete() throws SQLException;

	public int update() throws SQLException;
}