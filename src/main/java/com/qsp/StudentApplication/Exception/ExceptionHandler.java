package com.qsp.StudentApplication.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
@org.springframework.web.bind.annotation.ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorMessage> notfound(StudentNotFoundException e)
	{
		ErrorMessage errorMessage=new ErrorMessage(HttpStatus.BAD_GATEWAY,e.getMessage());
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.BAD_GATEWAY);
	}
}