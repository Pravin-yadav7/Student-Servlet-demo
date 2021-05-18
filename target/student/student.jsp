<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>student</title>

	<script src="resources/js/bootstrap.min.js"></script>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">


</head>
<body>

	<div class="container-fluid">
			<div class="row">
				<div class="col-md-12">
					<div class="row">
						<div class="col-md-6">
							<form class="form-horizontal" action="studentController"
								method="POST">
								<fieldset>
	
									<!-- Form Name -->
									<legend>Student Add</legend>
	
									<!-- Text input-->
									<div class="form-group">
										<label class="col-md-4 control-label" for="name">Name</label>
										<div class="col-md-4">
											<input id="name" name="name" type="text" placeholder=""
												class="form-control input-md">
	
										</div>
									</div>
	
									<!-- Text input-->
									<div class="form-group">
										<label class="col-md-4 control-label" for="surname">Course</label>
										<div class="col-md-4">
											<input id="surname" name="surname" type="text" placeholder=""
												class="form-control input-md">
	
										</div>
									</div>
	
									<!-- Text input-->
									<div class="form-group">
										<label class="col-md-4 control-label" for="salary">Fee</label>
										<div class="col-md-4">
											<input id="salary" name="salary" type="number" placeholder=""
												class="form-control input-md">
	
										</div>
									</div>
	
									<!-- Button -->
									<div class="form-group">
										<label class="col-md-4 control-label" for="add"></label>
										<div class="col-md-4">
											<input type="submit" class="btn btn-info"
												value="Add Student">
										</div>
									</div>
	
								</fieldset>
							</form>
						</div>
						<div class="col-md-6"></div>
					</div>
	
					<div class="row">
						<div class="col-md-6">
						<legend>Student List</legend>
							<div class="table-responsive">
								<table id="example" class="table table-striped table-bordered">							
								<thead>
									<tr>
										<th>Name</th>
										<th>Course</th>
										<th>Fee</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${allStudent}" var="student">
										<tr>
											<td><c:out value="${student.name}" /></td>
											<td><c:out value="${student.course}" /></td>
											<td><c:out value="${student.fee}" /></td>
											<td><a href="studentController?studentId=${student.id}"
												class="btn btn-danger" type="button">Delete</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							</div>
						</div>
						<div class="col-md-6"></div>
					</div>
				</div>
			</div>
		</div>


</body>
</html>