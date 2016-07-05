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
import com.aio.dao.QueryGradeDao;

@Transactional
@Repository("queryGradeDao")
public class QueryGradeDaoImpl implements QueryGradeDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<XsCjAllTdkchView> getByXh(String xh) throws SQLException {
		Session session = sessionFactory.getCurrentSession();
		String sql = "select a.kch,max(a.kcm) as kcm," + "max(a.ywkcm) as ywkcm," + "max(a.kcsxdm) as kcsxdm,"
				+ "max(a.kcsxmc) as kcsxmc," + "max(a.kccj) as kccj," + "max(a.xf） as xf," + "max(a.kssj) as kssj,"
				+ " " + " " + "max(a.cjlrfsdm) as cjlrfsdm "
				+ "from code_cjdj c, modified_xs_cj_all_tdkch_view a,"
				+ "(select kch,max(kccj) as kccj from modified_xs_cj_all_tdkch_view t where xh ='" + xh
				+ "' group by kch) b " + "where xh ='" + xh
				+ "' and a.kch=b.kch and a.kccj=b.kccj  group by a.kch order by kssj asc,kch asc";
		// String sql = "select * from MODIFIED_XS_CJ_ALL_TDKCH_VIEW where xh='"
		// + xh + "' order by kssj asc,kch asc ";
		Query query = session.createSQLQuery(sql).addEntity(XsCjAllTdkchView.class);
		return query.list();

	}

}
