package com.qsp.StudentApplication.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.qsp.StudentApplication.DTO.StudentSaveDTO;
import com.qsp.StudentApplication.Entity.Student;
import com.qsp.StudentApplication.Exception.StudentNotFoundException;
import com.qsp.StudentApplication.ResponseStructure.ResponseStructure;
import com.qsp.StudentApplication.Service.StudentService;
import com.qsp.StudentApplication.dto.StudentDto;

@RestController // RestAPI
@CrossOrigin
@RequestMapping(path = "api/v1/student")
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Student student) {
		ResponseStructure<Student> save = service.save(student);
		return new ResponseEntity<>("Inserted successfully", HttpStatus.OK);

	}

	@GetMapping(path = "/get")
	public ResponseEntity<?> studentDtos() {
		ResponseStructure<Student> fetch = service.fetch();

		return new ResponseEntity<>(fetch, HttpStatus.ACCEPTED);
	}

	@GetMapping("/get/{id}")
	public Student student(@PathVariable int id) throws StudentNotFoundException {
		return service.getOnePerson(id);
	}

	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		Student s = service.update(student);
		return s;
	}

	@PutMapping("/update/{id}")
	public Student updateById(@PathVariable int id, @RequestBody Student student) {
		Student s = service.updateId(id, student);
		return s;
	}

	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		String s = service.delete(id);
		return s;
	}

}
