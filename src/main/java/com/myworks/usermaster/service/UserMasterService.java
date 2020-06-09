package com.myworks.usermaster.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myworks.usermaster.dto.UserMasterDTO;
import com.myworks.usermaster.model.CMSRole;
import com.myworks.usermaster.model.UserMaster;
import com.myworks.usermaster.repository.UserMasterRepository;
import com.myworks.usermaster.repository.CMSRoleRepository;

@Service
public class UserMasterService {
	@Autowired
	UserMasterRepository userMasterRepository;
	
	@Autowired
	CMSRoleRepository CMSRoleRepository;

	
	public List<UserMaster> findAll(){
		List<UserMaster> users=new ArrayList<>();
		userMasterRepository.findAll().forEach(users::add);
		return users;
	}
	
	public UserMaster findByUserId(String userId){
		return userMasterRepository.findByUserId(userId).orElse(new UserMaster());	
	}
	
	public UserMasterDTO save(UserMasterDTO userMasterDto){
		UserMasterDTO umDto=null;
		try{
			UserMaster umEntity= userMasterDto.toEntity();
			for(CMSRole role: umEntity.getRoles()){
				CMSRole actualCMSRole= CMSRoleRepository.findById(role.getRoleId()).orElse(new CMSRole());
				role.setAssignedPermissions(actualCMSRole.getAssignedPermissions());
			}
			umDto =new UserMasterDTO(userMasterRepository.save(umEntity));		
		}catch(Exception e){
			throw e;
		}
		return  umDto;
	}
}
