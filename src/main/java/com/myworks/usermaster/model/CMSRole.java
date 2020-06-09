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
import javax.persistence.Table;

@Entity
@Table(name = "cms_role")
public class CMSRole {

	@Id
	@GeneratedValue
	private Long roleId;
	private String roleName;

	@ManyToMany(cascade = { CascadeType.MERGE })
	@JoinTable(name = "cmsRolePermission", joinColumns = { @JoinColumn(name = "roleId") }, inverseJoinColumns = {
			@JoinColumn(name = "permissionId") })
	private Set<Permission> assignedPermissions;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<Permission> getAssignedPermissions() {
		if(assignedPermissions == null){
			assignedPermissions = new HashSet<>();
		}
		return assignedPermissions;
	}

	public void setAssignedPermissions(Set<Permission> assignedPermissions) {
		this.assignedPermissions = assignedPermissions;
	}

}
