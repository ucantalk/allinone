package com.aio.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.XsCjAllTdkchView;
import com.aio.dao.QueryScoreDao;

@Transactional
@Repository("queryScoreDao")
public class QueryScoreDaoImpl implements QueryScoreDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<XsCjAllTdkchView> getByXh(String xh) throws SQLException {
		Session session = sessionFactory.getCurrentSession();
		String sql = "select * from MODIFIED_XS_CJ_ALL_TDKCH_VIEW where xh='" + xh + "' order by kssj asc,kch asc ";
		Query query = session.createSQLQuery(sql).addEntity(XsCjAllTdkchView.class);
		return query.list();
		
	}

}
