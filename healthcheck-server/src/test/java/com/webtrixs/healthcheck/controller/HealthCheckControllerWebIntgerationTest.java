package com.webtrixs.healthcheck.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

public class HealthCheckControllerWebIntgerationTest {

	@Value("${local.server.port}")
	int port;
	
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
		
		TestRestTemplate restTemplate = new TestRestTemplate();
		ResponseEntity<String> response = 	restTemplate.getForEntity("http://localhost:"+Integer.toString(port)+"/api/v1/hc", String.class);
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		System.out.println(response.getBody());
		System.out.println("Port :"+Integer.toString(port));
	}

}
