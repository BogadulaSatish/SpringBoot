package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{

	   @Modifying
	   @Transactional
	   @Query("Update UserEntity set Active_SW = :status where userId = :id")
       public void UpdateUserStatus(Integer id , String status);
	
	   
	  
	}
