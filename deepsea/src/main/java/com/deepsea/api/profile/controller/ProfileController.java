package com.deepsea.api.profile.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepsea.api.profile.repository.ProfileRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ProfileController {
	
	@Autowired
	private ProfileRepository profileRepository;
	
	@GetMapping("/hello")
	public Map<String, String> hello() {
		String currentDate = profileRepository.findTest();
		log.info("currentDate: {}", currentDate);
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "leaf");
		map.put("time", currentDate);
		
		return map;
	}
	
}
