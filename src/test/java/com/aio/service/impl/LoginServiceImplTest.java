package com.aio.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aio.exception.ConnectDBException;
import com.aio.service.LoginService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml" })
public class LoginServiceImplTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private LoginService loginService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		try {
			String result = loginService.ifCorrectUser("2012212511", "missyou123");
		} catch (ConnectDBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
