package com.spring.userApp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class UserController {
	@Autowired
	private UserServiese us;
	
	
   @PostMapping("/signup")
  public ResponseEntity<User> SaveUser(@RequestBody @Valid User user){
	  
	  User insertData = us.InsertData(user);
	 return new ResponseEntity<User>(insertData, HttpStatus.CREATED);
  }
 
 @GetMapping("/fetchAll")
  public ResponseEntity<List<User>> getAlluser(){
	 
	 ResponseEntity<List<User>> ok = ResponseEntity.ok(us.geAll());
	 return ok;
  }
 @GetMapping("/get/{id}")
   public ResponseEntity<User> getByAd(@PathVariable("id") int id){
	 
	 
	return ResponseEntity.ok(us.getById(id));	   
   } 
}
