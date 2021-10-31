package com.deepsea;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.deepsea.api.profile.repository.ProfileRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class DeepseaApplicationTests {

	@Autowired
	private ProfileRepository profileRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void 테스트입니다() {
		String result = profileRepository.findTest();
		log.info("result: {}", result);
		assertTrue(false);
	}
	
}
