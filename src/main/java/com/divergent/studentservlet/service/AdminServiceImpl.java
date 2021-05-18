package com.divergent.studentservlet.service;

import com.divergent.studentservlet.dao.AdminDao;
import com.divergent.studentservlet.dao.AdminDaoImpl;
import com.divergent.studentservlet.entity.Admin;

public class AdminServiceImpl implements AdminService {

	
	public boolean login(String username, String password) {

		AdminDao adminDao = new AdminDaoImpl();

		Admin admin = adminDao.login(username);
		if (admin == null)
			return false;
		return username.equals(admin.getUsername()) && password.equals(admin.getPassword());
	}

}
