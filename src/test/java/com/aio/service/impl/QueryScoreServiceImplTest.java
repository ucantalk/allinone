package com.aio.service.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aio.dao.QueryGradeDao;
import com.aio.exception.ConnectDBException;
import com.aio.exception.NullUserGradeException;
import com.aio.service.QueryGradeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml" })
public class QueryScoreServiceImplTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private QueryGradeDao queryGradeDao;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetCurrentScoresByXh() {
		try {
			List r = queryGradeDao.getByXh("2013211090");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
