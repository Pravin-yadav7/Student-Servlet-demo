package com.divergent.studentservlet.service;

import java.util.List;

import com.divergent.studentservlet.dao.BaseDao;
import com.divergent.studentservlet.dao.StudentDaoImpl;
import com.divergent.studentservlet.entity.Student;

public class StudentServiceImpl implements StudentService {
	
	BaseDao<Student> studentDao = new StudentDaoImpl();
	/*//private StudentDaoImpl studentDao;

	public StudentServiceImpl() {//
	  //studentDao =  new StudentDao();
	}
*/

	@Override
	public void insert(Student student) {
		
		studentDao.insert(student);
		
	}

	@Override
	public List<Student> findAll() {
		
		return studentDao.findAll();
	}

	@Override
	public Student find(int studentId) {
		
		return studentDao.find(studentId);
	}

	@Override
	public void delete(int studentId) {
		
		studentDao.remove(studentId);
		
	}

	
}
