package com.aio.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.SysConfig;
import com.aio.dao.SysConfigDao;
import com.aio.exception.ConnectDBException;
import com.aio.service.SysConfigService;

@Transactional
@Service("sysConfigService")
public class SysConfigServiceImpl implements SysConfigService {

	@Autowired
	private SysConfigDao sysConfigDao;

	@Override
	public List<SysConfig> getAllSysConfig() throws ConnectDBException {
		try {
			List<SysConfig> list = sysConfigDao.getAll();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ConnectDBException("数据库连接失败或者查询数据错误");
		}

	}

}