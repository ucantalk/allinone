package com.aio.service.impl;

import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aio.exception.ConnectDBException;
import com.aio.exception.NullUserInfoException;
import com.aio.service.QueryUserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml" })
public class QueryUserInfoServiceImplTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private QueryUserInfoService queryUserInfoService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetUserInfoByXh() throws Exception {
		try {
			queryUserInfoService.getUserInfoByXh("20131211090");
		} catch (NullUserInfoException | ConnectDBException e) {
			 
			e.printStackTrace();
		}
	}

}
