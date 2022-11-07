package com.example.test.demo;

import com.example.test.demo.service.UrlService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@InjectMocks
	UrlService urlService;

	DemoApplicationTests() {
		urlService = new UrlService();
	}

	@Test
	void contextLoads() {
	}

	@Test
	void testValidUrlGoodInput(){
	}

	@Test
	void testValidUrlBadInput(){
	}

	@Test
	void testRandomCharacterGeneration(){

	}

}
