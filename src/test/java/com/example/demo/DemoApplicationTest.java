package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
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
	public void contextLoad() {
		Assert.assertSame(true,true);
	}

}
