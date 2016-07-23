package com.aio.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.XsCjAllTdkchView;
import com.aio.dao.QueryGradeDao;
import com.aio.exception.AioRuntimeException;
import com.aio.exception.ConnectDBException;
import com.aio.exception.NullUserGradeException;
import com.aio.service.QueryGradeService;

@Transactional
@Service("queryGradeService")
public class QueryGradeServiceImpl implements QueryGradeService {
	@Autowired
	private QueryGradeDao queryGradeDao;

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
	 * @exception NullUserGradeException
	 *                无学生成绩数据异常
	 * @exception ConnectDBException
	 *                查询数据异常，连接数据库异常
	 * 
	 */
	@Override
	public List<XsCjAllTdkchView> getCurrentGradeByXh(String xh) throws NullUserGradeException, ConnectDBException {
		List<Object> rs;
		List<XsCjAllTdkchView> xsCjTdkchView = new ArrayList<XsCjAllTdkchView>();
		try {
			rs = queryGradeDao.getByXh(xh);
			if (rs != null) {
				if (rs.size() > 0) {
					for (int i = 0; i < rs.size(); i++) {
						XsCjAllTdkchView tmp = new XsCjAllTdkchView();
						Object[] objClass = (Object[]) rs.get(i);
						tmp.setXh(objClass[0] != null && !objClass[0].equals("") ? objClass[0].toString() : null);
						tmp.setKch(objClass[1] != null && !objClass[1].equals("") ? objClass[1].toString() : null);
						tmp.setZxjxjhh(objClass[2] != null && !objClass[2].equals("") ? objClass[2].toString() : null);
						tmp.setKcm(objClass[3] != null && !objClass[3].equals("") ? objClass[3].toString() : null);
						tmp.setYwkcm(objClass[4] != null && !objClass[4].equals("") ? objClass[4].toString() : null);
						tmp.setKcsxdm(objClass[5] != null && !objClass[5].equals("") ? objClass[5].toString() : null);
						tmp.setKcsxmc(objClass[6] != null && !objClass[6].equals("") ? objClass[6].toString() : null);
						tmp.setYwkcsxmc(objClass[7] != null && !objClass[7].equals("") ? objClass[7].toString() : null);
						tmp.setKccj(objClass[8] != null && !objClass[8].equals("") ? objClass[8].toString() : null);
						tmp.setXf(objClass[9] != null && !objClass[9].equals("") ? objClass[9].toString() : null);
						tmp.setKssj(objClass[10] != null && !objClass[10].equals("") ? objClass[10].toString() : null);
						tmp.setDjm(objClass[11] != null && !objClass[11].equals("") ? objClass[11].toString() : null);
						tmp.setYwdjm(objClass[12] != null && !objClass[12].equals("") ? objClass[12].toString() : null);
						tmp.setCjlrfsdm(
								objClass[13] != null && !objClass[13].equals("") ? objClass[13].toString() : null);

						switch (Integer.parseInt(tmp.getZxjxjhh().substring(10, 11))) {
						case 1:
							tmp.setZwksxq(tmp.getZxjxjhh().substring(0, 4) + "年秋");
							tmp.setYwksxq(tmp.getZxjxjhh().substring(0, 4) + "Fall");
							break;
						case 2:
							tmp.setZwksxq(tmp.getZxjxjhh().substring(5, 9) + "年春");
							tmp.setYwksxq(tmp.getZxjxjhh().substring(5, 9) + "Spring");
							break;
						case 3:
							tmp.setZwksxq(tmp.getZxjxjhh().substring(5, 9) + "年夏");
							tmp.setYwksxq(tmp.getZxjxjhh().substring(5, 9) + "Summer");
							break;
						}
						xsCjTdkchView.add(tmp);
					}
					return null;
				}

			}
			throw new NullUserGradeException("读取学生数据出错:无此学生或学生数据为空");
		} catch (AioRuntimeException e) {
			throw new ConnectDBException("连接数据库失败或者查询数据出错");
		}

	}

}
