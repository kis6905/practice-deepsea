package com.deepsea.api.profile.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfileRepository {
	
	String findTest();

}
