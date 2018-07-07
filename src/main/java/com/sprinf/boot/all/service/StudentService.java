package com.sprinf.boot.all.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprinf.boot.all.bean.StudentBean;
import com.sprinf.boot.all.entity.Student;
import com.sprinf.boot.all.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	public StudentRepository studentRepository;

	public Student insert(StudentBean bean) {
		Student student = new Student();
		student.setId(bean.getId());
		student.setName(bean.getFirstname());
		student.setQualification(bean.getLastname());

		studentRepository.save(student);

		return student;
	}

}
