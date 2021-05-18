package com.divergent.studentservlet.service;

import java.util.List;

import com.divergent.studentservlet.entity.Student;

public interface StudentService {

	public void insert(Student student);

	public List<Student>findAll();

	public Student find(int studentId);

	public void delete(int studentId);

}