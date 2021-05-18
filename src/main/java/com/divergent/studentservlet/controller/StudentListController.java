package com.divergent.studentservlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.divergent.studentservlet.entity.Student;
import com.divergent.studentservlet.service.StudentService;
import com.divergent.studentservlet.service.StudentServiceImpl;

@WebServlet("/studentList")
public class StudentListController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public StudentListController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentService studentService = new StudentServiceImpl();

		List<Student> allStudent = studentService.findAll();
		request.setAttribute("allStudent", allStudent);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StudentList.jsp");

		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
