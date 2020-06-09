package com.myworks.usermaster.dto;

import com.myworks.usermaster.model.CMSRole;

public class CMSRoleDTO {	
	private Long roleId;
	private String roleName;

	public CMSRoleDTO(){
		super();
	}
	public CMSRoleDTO(CMSRole cmsRole){
		if(cmsRole !=null){
			this.roleId =cmsRole.getRoleId();
			this.roleName =cmsRole.getRoleName();
		}
	}
	public CMSRole toEntity(){
		CMSRole role=new CMSRole();
		role.setRoleId(this.roleId);
		role.setRoleName(this.roleName);
		
		return role;
	}

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
}
