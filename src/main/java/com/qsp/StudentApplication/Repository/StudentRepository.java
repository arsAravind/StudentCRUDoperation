package com.qsp.StudentApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.qsp.StudentApplication.Entity.Student;

@EnableJpaRepositories
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
