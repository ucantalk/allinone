package com.aio.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.SysConfig;
import com.aio.dao.SysConfigDao;
import com.aio.exception.AioRuntimeException;

@Transactional
@Repository("sysConfigDao")
public class SysConfigDaoImpl extends BaseDaoImpl<SysConfig, String> implements SysConfigDao {

	@Override
	public List<SysConfig> getAll() {
		try {
			String sql = "select * from sys_config";
			List<SysConfig> result = super.getListBySQLCastToClass(sql);
			return result;
		} catch (Exception e) {
			throw new AioRuntimeException(e);
		}
	}

	@Override
	public String saveAll(SysConfig s) {
		return null;
	}

	@Override
	public int delete() {
		return 0;
	}

	@Override
	public int update() {
		return 0;
	}
}