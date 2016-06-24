package com.aio.service;

import com.aio.exception.ConnectDBException;

public interface LoginService {

	public String ifCorrectUser(String zjh, String password) throws ConnectDBException;

}
