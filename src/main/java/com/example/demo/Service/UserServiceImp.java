package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Repo.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	UserRepository repo;

	@Override
	public String SaveorUpdateUser(UserEntity entity) {
		
		repo.save(entity);
		if(entity.getUserId() != null) {
		return "User saved";
		}
		else {
			return "not saved";
		}
		
	}

	@Override
	public List<UserEntity> getAllUsers() {
		
		List<UserEntity> users = repo.findAll();
		return users;
	}

	@Override
	public UserEntity FindUserrById(Integer id) {
		
		Optional<UserEntity> findedEntity = repo.findById(id);
		
		if(findedEntity.isPresent())
		{
			return findedEntity.get();
		}
	
		return null;
	}

	@Override
	public boolean DeleteUser(Integer id) {
		
		try{
			repo.deleteById(id);
		}
		catch(Exception e){
			return true;
		}
		return false;
	}

	@Override
	public boolean UpdateUser(Integer id, String Status) {
		
		try {
			repo.UpdateUserStatus(id, Status);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

}
