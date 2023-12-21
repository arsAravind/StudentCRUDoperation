package com.qsp.StudentApplication.Exception;

public class StudentNotFoundException extends Exception{

@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return "ID not found";
}
	
}
