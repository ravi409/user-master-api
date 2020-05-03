package com.myworks.usermaster.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myworks.usermaster.model.UserMaster;
import com.myworks.usermaster.service.UserMasterService;

@RestController
public class UserMasterController {
	
	@Autowired
	UserMasterService userMasterService;
	
	@GetMapping("/usermaster")
	public List<UserMaster> getAllUserMasterDetails(){
		return userMasterService.findAll();
	}
	
	@GetMapping("/usermaster/{userId}")
	public UserMaster getUserMasterByUserId(String userId){
		return userMasterService.findByUserId(userId);
	}
	
	@PostMapping("/usermaster")
	public UserMaster saveUserMaster(@RequestBody UserMaster userMaster){
		return userMasterService.save(userMaster);
	}
}
