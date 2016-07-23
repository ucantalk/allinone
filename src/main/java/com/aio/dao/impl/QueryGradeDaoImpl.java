package com.aio.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aio.dao.QueryGradeDao;
import com.aio.exception.AioRuntimeException;

@Transactional
@Repository("queryGradeDao")
public class QueryGradeDaoImpl extends BaseDaoImpl<Object, String> implements QueryGradeDao {

	@Override
	public List<Object> getByXh(String xh) {
		try {
			String sql = "select a.xh as xh,a.kch as kch,a.zxjxjhh as zxjxjhh,(max(a.kcm)) as kcm,(max(a.ywkcm)) as ywkcm,(max(a.kcsxdm)) as kcsxdm,"
					+ "(max(a.kcsxmc)) as kcsxmc,(max(ywkcsxmc)) as ywkcsxmc,(max(a.kccj)) as kccj,"
					+ "(max(a.xf)) as xf,(max(a.kssj)) as kssj,(max(a.djm)) as djm,(max(a.ywdjm)) as ywdjm,"
					+ "(max(a.cjlrfsdm)) as cjlrfsdm from modified_xs_cj_all_tdkch_view a,"
					+ "(select t.kch,(max(t.kccj)) as kccj from modified_xs_cj_all_tdkch_view t where t.xh ='" + xh
					+ "' group by t.kch) b " + "where a.xh ='" + xh
					+ "' and a.kch=b.kch and a.kccj=b.kccj  group by a.xh,a.kch,a.zxjxjhh order by kssj asc,kch asc";
			List<Object> list = super.getListBySQL(sql);
			return list;
		} catch (Exception e) {
			throw new AioRuntimeException(e);
		}

	}

}
