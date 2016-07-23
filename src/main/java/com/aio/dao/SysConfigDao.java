package com.aio.dao;

import java.util.List;

import com.aio.bean.SysConfig;

public interface SysConfigDao {

	public List<SysConfig> getAll();

	public String saveAll(SysConfig s);

	public int delete();

	public int update();
}