package com.qsp.StudentApplication.ResponseStructure;

import java.util.List;

import org.springframework.http.HttpStatus;

public class ResponseStructure<T>{
	
	private T data;
	private List data1;
	private String httpmessage;
	private int httpstatuscode;
	private HttpStatus httpStatus;
	public List getData1() {
		return data1;
	}
	public void setData1(List data1) {
		this.data1 = data1;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getHttpmessage() {
		return httpmessage;
	}
	public void setHttpmessage(String httpmessage) {
		this.httpmessage = httpmessage;
	}
	public int getHttpstatuscode() {
		return httpstatuscode;
	}
	public void setHttpstatuscode(int httpstatuscode) {
		this.httpstatuscode = httpstatuscode;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
