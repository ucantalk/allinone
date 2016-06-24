package com.aio.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.SysConfig;
import com.aio.dao.SysConfigDao;

@Transactional
@Repository("sysConfigDao")
public class SysConfigDaoImpl extends BaseDaoImpl<SysConfig, String> implements SysConfigDao {

	@Override
	public List<SysConfig> getAll() throws SQLException {
		String sql = "select * from sys_config";
		List<SysConfig> result = super.getListBySQLCastToClass(sql);
		return result;
	}

	@Override
	public String saveAll(SysConfig s) throws SQLException {
		return null;
	}

	@Override
	public int delete() throws SQLException {
		return 0;
	}

	@Override
	public int update() throws SQLException {
		return 0;
	}
}