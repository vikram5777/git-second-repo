package com.spring.userApp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class userAdvoice {

	 @ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler
	public Map<String,String> HandalInvalidArgument(MethodArgumentNotValidException ex){
		   Map<String, String> errormap= new HashMap<>();
		   ex.getBindingResult().getFieldErrors().forEach(error->{
			   errormap.put(error.getField(), error.getDefaultMessage());
		   });
		return errormap;
		
	}
}
   