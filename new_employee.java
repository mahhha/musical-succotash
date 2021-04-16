<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
		<h1>Employee Management System</h1>
		<hr>
		<h2>Save Employee</h2>

		<form action="#" th:action="@{/saveEmployee}" th:object="${employee}"
			method="POST">
			<input type="text" th:field="*{firstName}"
				placeholder="Employee First Name" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{lastName}"
				placeholder="Employee Last Name" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{employeeId}"
				placeholder="Employee ID" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{startDate}"
				placeholder="Start Date" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{endDate}"
				placeholder="End Date" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{designation}"
				placeholder="Designation" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{department}"
				placeholder="Department" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{status}"
				placeholder="Status" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{dob}"
				placeholder="DOB" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{reportingManager}"
				placeholder="Reporting Manager" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{gender}"
				placeholder="Gender" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{bloodGroup}"
				placeholder="Blood Group" class="form-control mb-4 col-4">
				
				<input type="text" th:field="*{address}"
				placeholder="Address" class="form-control mb-4 col-4">
				
				<button type="submit" class="btn btn-info col-2"> Save Employee</button>
		</form>
		
		<hr>
		
		<a th:href = "@{/}"> Back to Employee List</a>
	</div>
</body>
</html>
