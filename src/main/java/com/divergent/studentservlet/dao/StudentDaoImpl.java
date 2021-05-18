package com.divergent.studentservlet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.divergent.studentservlet.entity.Student;
import com.divergent.studentservlet.service.StudentService;
import com.divergent.studentservlet.utility.EntityManagerUtility;


public class StudentDaoImpl implements BaseDao<Student> {
	
	public void insert(Student student) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();
		//return student;
	}
	
	public Student find(int id) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Student student = entityManager.find(Student.class, id);
		entityManager.close();
		return student;
	}
	
	public List<Student> findAll() {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		TypedQuery<Student> query = entityManager.createQuery("Select s from Student s", Student.class);
		List<Student> students = query.getResultList();
		entityManager.close();
		return students;

	}

	public void remove(int id) {

		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Student student = entityManager.find(Student.class, id);
		if (student != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(student);
			entityManager.getTransaction().commit();
			entityManager.close();
		}
		
	}

}
