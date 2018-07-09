package com.sprinf.boot.all.service;

import java.util.List;

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

	public Student deleteid(StudentBean bean) {
		Student student = new Student();
		student.setId(bean.getId());

		studentRepository.delete(student);

		return student;
	}

	public Student update(StudentBean bean) {
		Student st = new Student();
		st.setId(bean.getId());
		st.setName(bean.getFirstname());
		st.setQualification(bean.getLastname());

		studentRepository.save(st);

		return st;
	}

	public Iterable<String> select(StudentBean st) {

		Iterable<String> id = (Iterable<String>) new Student();
		((StudentBean) id).setId(st.getId());
		studentRepository.findAllById(id);

		return id;
	}
}
