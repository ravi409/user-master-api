package com.myworks.usermaster.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class UserMaster {

	@Id
	@GeneratedValue
	private Long userMasterId;
	private String userId;
	private String userName;
	private String keyclockId;
	private String emailId;

	@ManyToMany(cascade = { CascadeType.MERGE })
	@JoinTable(name = "userMasterRole", joinColumns = { @JoinColumn(name = "userMasterId") }, inverseJoinColumns = {
			@JoinColumn(name = "roleId") })
	private Set<CMSRole> roles;

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

	public Set<CMSRole> getRoles() {
		if(roles == null){
			roles = new HashSet<>();
		}
		return roles;
	}

	public void setRoles(Set<CMSRole> roles) {
		this.roles = roles;
	}

}
