  package com.divergent.studentservlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.divergent.studentservlet.entity.Student;
import com.divergent.studentservlet.service.StudentService;
import com.divergent.studentservlet.service.StudentServiceImpl;


@WebServlet("/studentInsert")
public class StudentInsertController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private final StudentService studentService = new StudentServiceImpl();

	public StudentInsertController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int studentId = Integer.parseInt(request.getParameter("student_id"));
		String studentName = request.getParameter("student_name");
		String studentLastName = request.getParameter("student_lastName");
		String gender = request.getParameter("gender");
		String studentCourse = request.getParameter("student_course");
		int studentFee = Integer.parseInt(request.getParameter("student_fee"));
		int studentAge = Integer.parseInt(request.getParameter("student_age"));
		long contactNumber = Integer.parseInt(request.getParameter("contact_number"));

		//PatientService patientService = new PatientServiceImpl();
		//patientService.insert(studentId, studentName,studentLastName, gender,studentCourse,studentFee, studentAge, contactNumber);
		Student student = new Student(studentId, studentName,studentLastName, gender,studentCourse,studentFee, studentAge, contactNumber);
		studentService.insert(student);
		response.sendRedirect("StudentMenu.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
