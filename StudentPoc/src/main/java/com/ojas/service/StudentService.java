package com.ojas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.Dao.StudentDao;

import com.ojas.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao stdDao;

	public Student createStudent(Student student) {
		return stdDao.save(student);
	}

	public Optional<Student> getById(Integer stdId) {
		return stdDao.findById(stdId);
	}

}
