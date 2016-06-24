package com.aio.dao.impl;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.XsZpView;
import com.aio.dao.QueryUserPhotoDao;

@Transactional
@Repository("queryUserPhotoDao")
public class QueryUserPhotoDaoImpl implements QueryUserPhotoDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public XsZpView getByXh(String xh) throws SQLException {
		Session session = sessionFactory.getCurrentSession();
		return (XsZpView) session.get(XsZpView.class, xh);
	}

}
