package com.myworks.usermaster.repository;

import org.springframework.stereotype.Repository;

import com.myworks.usermaster.model.CMSRole;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CMSRoleRepository extends JpaRepository<CMSRole, Long>{
	
}
