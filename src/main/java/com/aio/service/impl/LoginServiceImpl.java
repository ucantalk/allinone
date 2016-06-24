package com.aio.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aio.bean.SysYhmmbView;
import com.aio.dao.LoginDao;
import com.aio.exception.ConnectDBException;
import com.aio.service.LoginService;

@Transactional
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao loginDao;

	/**
	 * 判断是否有效用户
	 * 
	 * @author 薛宁
	 * @since 2016/06/08
	 * @param id
	 *            学号
	 * @param mm
	 *            密码
	 * 
	 * @return 200 正确的用户 201 错误的密码 505 错误的用户权限 404 错误的用户名
	 * 
	 */
	@Override
	public String ifCorrectUser(String id, String mm) throws ConnectDBException {
		SysYhmmbView userLogin;
		try {
			userLogin = loginDao.getById(id);
			if (userLogin != null) {
				if (userLogin.getYhlbdm().equals("01")) {
					if (userLogin.getMm().equals(mm)) {
						return "200";
					}
					return "201";
				}
				return "505";
			}
			return "404";
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ConnectDBException ("连接数据库失败或者查询数据出错");
		}

	}

}
