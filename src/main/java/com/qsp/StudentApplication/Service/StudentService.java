package com.qsp.StudentApplication.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.qsp.StudentApplication.DTO.StudentSaveDTO;
import com.qsp.StudentApplication.Entity.Student;
import com.qsp.StudentApplication.Exception.StudentNotFoundException;
import com.qsp.StudentApplication.ResponseStructure.ResponseStructure;
import com.qsp.StudentApplication.dto.StudentDto;


public interface StudentService {

	String CreateStudent(Student save);

	

	Student getOnePerson(int id) throws StudentNotFoundException ;

	Student update(Student student);

	Student updateId(Student student);

	Student updateId(int id, Student student);

	String delete(int id);

	ResponseStructure<Student> save(Student student);



	ResponseStructure<Student> fetch();

	

//	Student CreateStudent(StudentDto saveDTO);


	
	
}
