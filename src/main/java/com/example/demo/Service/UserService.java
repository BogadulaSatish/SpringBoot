package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.UserEntity;

public interface UserService {

	public String SaveorUpdateUser(UserEntity entity);
	
	public List<UserEntity> getAllUsers();
	
	public UserEntity FindUserrById(Integer id);
	
	public boolean DeleteUser(Integer id);
	
	public boolean UpdateUser(Integer id, String Status);
}
