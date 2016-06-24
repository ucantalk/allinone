package com.aio.action;

import org.apache.struts2.StrutsSpringTestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.opensymphony.xwork2.ActionProxy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:struts.xml", "classpath:spring.xml", "classpath:spring-hibernate.xml" })
public class SysInitActionTest extends StrutsSpringTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testExecute() throws Exception {
		ActionProxy proxy = this.getActionProxy("init.action");
		SysInitAction initAction = (SysInitAction) proxy.getAction();
		proxy.execute();
	}

}
