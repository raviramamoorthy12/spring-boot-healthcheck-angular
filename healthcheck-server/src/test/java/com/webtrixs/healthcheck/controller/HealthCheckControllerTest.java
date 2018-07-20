package com.webtrixs.healthcheck.controller;




import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.webtrixs.healthcheck.model.HealthCheck;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthCheckControllerTest {
	
	@Autowired
	HealthCheckController hcc ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetHealthCheck() {
		
		List<HealthCheck> hcList = 	hcc.getHealthCheck();
		assertThat(hcList.size(), is(2));
		//assertEquals(2, hcList.size());
		System.out.println(hcList.size());
		
	}

}
