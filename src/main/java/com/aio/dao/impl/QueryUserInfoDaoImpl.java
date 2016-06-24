package com.aio.dao.impl;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.XsXjbView;
import com.aio.dao.QueryUserInfoDao;

@Transactional
@Repository("queryUserInfoDao")
public class QueryUserInfoDaoImpl implements QueryUserInfoDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public XsXjbView getByXh(String xh) throws SQLException {
		Session session = sessionFactory.getCurrentSession();
		return (XsXjbView) session.get(XsXjbView.class, xh);
	}

}
