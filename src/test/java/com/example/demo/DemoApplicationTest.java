package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTest {

	public static Logger logger = LoggerFactory.getLogger(DemoApplicationTest.class);

	@Test
	public void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}


}
