package com.qsp.StudentApplication.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "STUDENT")
@Data
@NoArgsConstructor

@ToString
public class Student {
	@Id
	@Column(name = "Student_Id")
	private int studentId;
	@Column(name = "Student_Name")
	private String studentName;
	@Column(name = "Student_PhoneNo")
	private String studentPhNo;
	@Column(name = "Student_Place")
	private String studentPlace;
	public Student(int studentId, String studentName, String studentPhNo, String studentPlace) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhNo = studentPhNo;
		this.studentPlace = studentPlace;
	}
	
	



}
