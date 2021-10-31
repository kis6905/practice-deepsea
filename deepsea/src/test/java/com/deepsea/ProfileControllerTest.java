package com.deepsea;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.deepsea.api.profile.controller.ProfileController;
import com.deepsea.api.profile.repository.ProfileRepository;

@WebMvcTest(ProfileController.class)
public class ProfileControllerTest {

	@Autowired
	MockMvc mvc;
	
	@MockBean
	ProfileRepository profileRepository;
	
	@Test
	@DisplayName("api test")
	void getTest() throws Exception {
		mvc.perform(get("/hello"))
			.andExpect(status().isOk());
	}	
}
