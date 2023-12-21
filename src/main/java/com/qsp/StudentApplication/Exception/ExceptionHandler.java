package com.qsp.StudentApplication.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
@org.springframework.web.bind.annotation.ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<Object> notfound(StudentNotFoundException e)
	{
		
		return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_GATEWAY);
	
	}
}