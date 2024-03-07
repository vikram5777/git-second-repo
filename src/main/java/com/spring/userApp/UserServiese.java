package com.spring.userApp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiese {
	@Autowired
  public UserRepo repo;
  
  public User InsertData(User user)
  {
	   User s1= new User();
	        s1.setId(user.getId());
	        s1.setName(user.getName());
	        s1.setEmail(user.getEmail());
	        s1.setActive(user.getActive());
		  User s = repo.save(s1);
	return s;
	  
  
	}
  public List<User> geAll(){
	   
	  
	  
	  return (List<User>) repo.findAll(); 
  }
    public User getById(int id) {
    	
    	 User user = repo.findById(id).get();
		return user;
    	
    }
}
