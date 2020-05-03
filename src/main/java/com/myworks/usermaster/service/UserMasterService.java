package com.myworks.usermaster.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myworks.usermaster.model.UserMaster;
import com.myworks.usermaster.repository.UserMasterRepository;

@Service
public class UserMasterService {
	@Autowired
	UserMasterRepository userMasterRepository;

	
	public List<UserMaster> findAll(){
		List<UserMaster> users=new ArrayList<>();
		userMasterRepository.findAll().forEach(users::add);
		return users;
	}
	
	public UserMaster findByUserId(String userId){
		return userMasterRepository.findByUserId(userId).orElse(new UserMaster());	
	}
	
	public UserMaster save(UserMaster userMaster){
		return userMasterRepository.save(userMaster);
	}
}
