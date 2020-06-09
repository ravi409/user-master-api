package com.myworks.usermaster.dto;

import java.util.HashSet;
import java.util.Set;

import com.myworks.usermaster.model.CMSRole;
import com.myworks.usermaster.model.Permission;
import com.myworks.usermaster.model.UserMaster;


public class UserMasterDTO {

	private Long userMasterId;
	private String userId;
	private String userName;
	private String keyclockId;
	private String emailId;	
	private Set<CMSRoleDTO> roles;
	private Set<Permission> assignedPermissions;
	
	public UserMasterDTO() {
		super();
	}
	
	public UserMasterDTO(UserMaster userMaster) {
		if(userMaster != null){
			this.userMasterId =userMaster.getUserMasterId();
			this.userId = userMaster.getUserId();
			this.userName = userMaster.getUserName();
			this.keyclockId = userMaster.getKeyclockId();
			this.emailId =userMaster.getEmailId();
			for(CMSRole cmsRole: userMaster.getRoles()){
				if(cmsRole != null){
					this.getRoles().add(new CMSRoleDTO(cmsRole));				
					this.getAssignedPermissions().addAll(cmsRole.getAssignedPermissions());
				}
			}
		}
	}
	public UserMaster toEntity(){
		UserMaster um=new UserMaster();
		um.setUserMasterId(this.userMasterId);
		um.setUserId(this.userId);
		um.setUserName(this.userName);
		um.setKeyclockId(this.keyclockId);
		um.setEmailId(this.emailId);
		for(CMSRoleDTO roleDto: this.getRoles()){
			um.getRoles().add(roleDto.toEntity());
		}
		return um;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getKeyclockId() {
		return keyclockId;
	}

	public void setKeyclockId(String keyclockId) {
		this.keyclockId = keyclockId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getUserMasterId() {
		return userMasterId;
	}

	public void setUserMasterId(Long userMasterId) {
		this.userMasterId = userMasterId;
	}

	public Set<CMSRoleDTO> getRoles() {
		if(roles == null){
			roles =new HashSet<>();
		}
		return roles;
	}

	public void setRoles(Set<CMSRoleDTO> roles) {
		this.roles = roles;
	}

	public Set<Permission> getAssignedPermissions() {
		if(assignedPermissions == null){
			assignedPermissions =new HashSet<>();
		}
		return assignedPermissions;
	}

	public void setAssignedPermissions(Set<Permission> assignedPermissions) {
		this.assignedPermissions = assignedPermissions;
	}

	
	

}
