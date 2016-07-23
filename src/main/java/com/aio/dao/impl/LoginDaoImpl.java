package com.aio.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.SysYhmmbView;
import com.aio.dao.LoginDao;
import com.aio.exception.AioRuntimeException;

@Transactional
@Repository("loginDao")
public class LoginDaoImpl extends BaseDaoImpl<SysYhmmbView, String> implements LoginDao {

	@Override
	public SysYhmmbView getById(String zjh) {
		try {
			SysYhmmbView result = super.get(zjh);
			return result;
		} catch (Exception e) {
			throw new AioRuntimeException(e);
		}
	}
}
