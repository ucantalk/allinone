package com.aio.service;

import java.util.List;

import com.aio.bean.XsCjAllTdkchView;
import com.aio.exception.ConnectDBException;
import com.aio.exception.NullUserGradeException;

public interface QueryGradeService {

	public List<XsCjAllTdkchView> getCurrentGradeByXh(String xh) throws NullUserGradeException,ConnectDBException;

}
