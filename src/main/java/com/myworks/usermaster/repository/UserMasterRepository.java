package com.myworks.usermaster.repository;

import org.springframework.stereotype.Repository;

import com.myworks.usermaster.model.UserMaster;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserMasterRepository extends JpaRepository<UserMaster, Long>{
	Optional<UserMaster> findByUserId(String userId);
}
