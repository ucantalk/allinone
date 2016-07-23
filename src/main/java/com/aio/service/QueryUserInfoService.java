package com.aio.service;

import com.aio.bean.XsXjbView;
import com.aio.exception.ConnectDBException;
import com.aio.exception.NullUserInfoException;

public interface QueryUserInfoService {

	public XsXjbView getUserInfoByXh(String xh);
}
