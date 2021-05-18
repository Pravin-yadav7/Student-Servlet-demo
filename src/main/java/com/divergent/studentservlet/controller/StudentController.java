package com.divergent.studentservlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import com.divergent.studentservlet.entity.Student;
import com.divergent.studentservlet.service.StudentServiceImpl;

@WebServlet("/studentController")
public class StudentController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private final StudentServiceImpl studentService = new StudentServiceImpl();
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		logger.debug("init() called !!!!");
	}
	
	@Override
	public void destroy() {
		super.destroy();
		logger.debug("destroy() called !!!!");
	}
	/*@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String studentName = req.getParameter("name");
		String studentCourse = req.getParameter("surname");
		int studentFee = Integer.parseInt(req.getParameter("salary"));

		Student student = new Student(studentName, studentCourse, studentFee);
		studentService.insertStudent(student);

		List<Student> allStudents = studentService.findAllStudent();
		req.setAttribute("allStudents", allStudents);
		RequestDispatcher dispatcher = req.getRequestDispatcher("student.jsp");
		dispatcher.forward(req, resp);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int studentId = Integer.parseInt(req.getParameter("studentId"));
		studentService.removeStudent(studentId);

		List<Student> allStudents = studentService.findAllStudent();
		req.setAttribute("allStudents", allStudents);
		RequestDispatcher dispatcher = req.getRequestDispatcher("student.jsp");
		dispatcher.forward(req, resp);
	}
*/

}
