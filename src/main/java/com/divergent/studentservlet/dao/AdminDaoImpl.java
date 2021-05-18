package com.divergent.studentservlet.dao;

import javax.persistence.EntityManager;

import com.divergent.studentservlet.entity.Admin;
import com.divergent.studentservlet.utility.EntityManagerUtility;

public class AdminDaoImpl implements AdminDao {

	public Admin login(String username) {
		
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		//entityManager.getTransaction().begin();
//		entityManager.persist(username);
		

		Admin admin = entityManager.find(Admin.class, username);
		
		//entityManager.getTransaction().commit();
		entityManager.close();
		return admin;
	}

}
