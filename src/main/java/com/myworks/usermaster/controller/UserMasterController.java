package com.myworks.usermaster.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myworks.usermaster.dto.UserMasterDTO;
import com.myworks.usermaster.service.UserMasterService;

@RestController
public class UserMasterController {
	
	@Autowired
	UserMasterService userMasterService;
	
	@GetMapping("/usermaster")
	public List<UserMasterDTO> getAllUserMasterDetails(){
		return userMasterService.findAll().stream().map(um -> new UserMasterDTO(um)).collect(Collectors.toList());
		
	}
	
	@GetMapping("/usermaster/{userId}")
	public UserMasterDTO getUserMasterByUserId(String userId){
		return new UserMasterDTO(userMasterService.findByUserId(userId));
	}
	
	@PostMapping("/usermaster")
	public UserMasterDTO saveUserMaster(@RequestBody UserMasterDTO userMasterDto){
		return userMasterService.save(userMasterDto);
	}
}
