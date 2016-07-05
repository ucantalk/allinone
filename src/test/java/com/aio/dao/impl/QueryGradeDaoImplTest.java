package com.aio.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aio.dao.QueryGradeDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml" })
public class QueryGradeDaoImplTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private QueryGradeDao queryGradeDao;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetByXh() {
		try {
			List l = queryGradeDao.getByXh("2013211090");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
