package com.aio.service;

import java.util.List;

import com.aio.bean.XsCjAllTdkchView;
import com.aio.exception.ConnectDBException;
import com.aio.exception.NullUserScoreException;

public interface QueryScoreService {

	public List<XsCjAllTdkchView> getCurrentScoresByXh(String xh) throws NullUserScoreException,ConnectDBException;

}
