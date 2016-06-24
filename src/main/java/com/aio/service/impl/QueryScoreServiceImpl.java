package com.aio.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.XsCjAllTdkchView;
import com.aio.dao.QueryScoreDao;
import com.aio.exception.ConnectDBException;
import com.aio.exception.NullUserScoreException;
import com.aio.service.QueryScoreService;

@Transactional
@Service("queryScoreService")
public class QueryScoreServiceImpl implements QueryScoreService {
	@Autowired
	private QueryScoreDao queryScoreDao;

	/**
	 * 获取用户成绩
	 * 
	 * @author 薛宁
	 * @since 2016/06/08
	 * 
	 * @param xh
	 *            学号
	 * 
	 * @return List<XsCjAllTdkchView>
	 * 
	 * 
	 * @exception NullUserScoreException
	 *                无学生成绩数据异常
	 * @exception ConnectDBException
	 *                查询数据异常，连接数据库异常
	 * 
	 */
	@Override
	public List<XsCjAllTdkchView> getCurrentScoresByXh(String xh) throws NullUserScoreException, ConnectDBException {
		List<XsCjAllTdkchView> xsCjTdkchView;

		try {
			xsCjTdkchView = queryScoreDao.getByXh(xh);
			if (xsCjTdkchView != null) {
				if (xsCjTdkchView.size() > 0) {
					for (XsCjAllTdkchView tmp : xsCjTdkchView) {

					}
				}
				return xsCjTdkchView;
			}
			throw new NullUserScoreException("读取学生数据出错:无此学生或学生数据为空");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ConnectDBException("连接数据库失败或者查询数据出错");
		}

	}

}
