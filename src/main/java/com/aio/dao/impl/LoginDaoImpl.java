package com.aio.dao.impl;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.SysYhmmbView;
import com.aio.dao.LoginDao;

@Transactional
@Repository("loginDao")
public class LoginDaoImpl extends BaseDaoImpl<SysYhmmbView, String> implements LoginDao {

	@Override
	public SysYhmmbView getById(String zjh) throws SQLException {
		SysYhmmbView result = super.get(zjh);
		return result;
	}
}
