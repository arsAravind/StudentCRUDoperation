package com.qsp.StudentApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@AllArgsConstructor
@NoArgsConstructor
@Data*/
public class StudentDto {

	private int studentId;
	private String studentName;
	private String studentPhNo;
	private String studentPlace;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhNo() {
		return studentPhNo;
	}

	public void setStudentPhNo(String studentPhNo) {
		this.studentPhNo = studentPhNo;
	}

	public String getStudentPlace() {
		return studentPlace;
	}

	public void setStudentPlace(String studentPlace) {
		this.studentPlace = studentPlace;
	}

	@Override
	public String toString() {
		return "StudentDto [studentId=" + studentId + ", studentName=" + studentName + ", studentPhNo=" + studentPhNo
				+ ", studentPlace=" + studentPlace + "]";
	}

	public StudentDto(int studentId, String studentName, String studentPhNo, String studentPlace) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhNo = studentPhNo;
		this.studentPlace = studentPlace;
	}

	public StudentDto() {
	}
}