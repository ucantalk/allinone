package com.aio.service;

import java.util.List;

import com.aio.bean.SysConfig;
import com.aio.exception.ConnectDBException;

public interface SysConfigService {

	public List<SysConfig> getAllSysConfig();

}