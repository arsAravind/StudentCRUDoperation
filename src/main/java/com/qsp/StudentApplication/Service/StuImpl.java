package com.qsp.StudentApplication.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.qsp.StudentApplication.Entity.Student;
import com.qsp.StudentApplication.Exception.StudentNotFoundException;
import com.qsp.StudentApplication.Repository.StudentRepository;
import com.qsp.StudentApplication.ResponseStructure.ResponseStructure;
import com.qsp.StudentApplication.dto.StudentDto;

@Service
public class StuImpl implements StudentService {
	@Autowired
	StudentRepository repository;

	@Override
	public String CreateStudent(Student save) {
		Student s = new Student();
		s.setStudentId(save.getStudentId());
		s.setStudentName(save.getStudentName());
		s.setStudentPhNo(save.getStudentPhNo());
		s.setStudentPlace(save.getStudentPlace());
		repository.save(s);
		return s.getStudentName();
	}

	@Override
	public ResponseStructure<Student> fetch() {

		List<Student> findAll = repository.findAll();
		ResponseStructure<Student> structure=new ResponseStructure<>();
		structure.setData1(findAll);
		structure.setHttpmessage("Fetched all the detail");
		structure.setHttpStatus(HttpStatus.ACCEPTED);
		structure.setHttpstatuscode(200);
		

		return  structure;
	}

	@Override
	public Student getOnePerson(int id) throws StudentNotFoundException {
		Optional<Student> findById = repository.findById(id);

		if(!findById.isPresent())
		{
			throw new StudentNotFoundException();
		}
		return findById.get();
		}

	@Override
	public Student update(Student student) {

		Student findById = repository.findById(student.getStudentId()).orElse(null);

		if (findById != null) {
			findById.setStudentId(student.getStudentId());
			findById.setStudentName(student.getStudentName());
			findById.setStudentPhNo(student.getStudentPhNo());
			findById.setStudentPlace(student.getStudentPlace());

			repository.save(findById);
		}

		return findById;
	}

	@Override
	public Student updateId(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateId(int id, Student student) {

		Student findById = repository.findById(id).orElse(null);

		if (findById != null) {
			findById.setStudentId(student.getStudentId());
			findById.setStudentName(student.getStudentName());
			findById.setStudentPhNo(student.getStudentPhNo());
			findById.setStudentPlace(student.getStudentPlace());

			repository.save(findById);
		}

		return findById;
	}

	@Override
	public String delete(int id) {

//		repository.deleteById(id);
//		
//		return "Deleted";

		Student findById = repository.findById(id).orElse(null);

		if (findById != null) {
			repository.delete(findById);
		}

		else {
			throw new RuntimeException("Id not found");
		}

		return "removed";
	}

	@Override
	public ResponseStructure<Student> save(Student student) {
		Student save = repository.save(student);
		ResponseStructure<Student> structure=new ResponseStructure<>();
		structure.setData(save);
		structure.setHttpmessage("Data saved Successfully");
		structure.setHttpStatus(HttpStatus.ACCEPTED);
		structure.setHttpstatuscode(200);
		
		return structure;
		
	}

//	@Autowired
//	private StudentRepository repository ;
//@Override
//public String  CreateStudent(StudentDto saveDTO) {
//	
//	
//	
//	Student s1=new Student(
//saveDTO.getStudentId(),
//saveDTO.getStudentName(),
//saveDTO.getStudentPhNo()	,
//saveDTO.getStudentPlace());
//	repository.save(s1);
//	return s1.getStudentName();
//	
//}
//	
//

}
