<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>

<html><head>
<title>Appointment Form</title>
<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css"/>

<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/appointment-style.css"/>

</head>
<body>
<div id="wrapper">
	<div id="header" >
	<h2>Appointment Form</h2>
	</div>
	<div id="container" >
	<h2>Take Appointment</h2>
	<form:form action="saveAppointment" modelAttribute="appointment" method="POST">
	<form:hidden path="serialNo"/>
	
	<table>
		<tbody>
		
		<tr>
			<td><lable>Serial No </lable></td>
			<td><form:input path="serialNo" /></form></td>
		</tr>
		
		
		<tr>
			<td><lable>Patient Name</lable></td>
			<td><form:input path="patientName" /></form></td>
		</tr>
		<tr>	
			<td><lable>Email Id</lable></td>
			<td><form:input path="emailid" /></form></td>
		</tr>
		<tr>	
			<td><lable>Patient Mobile No</lable></td>
			<td><form:input path="patientMobileNo" /></form></td>
		</tr>
		<tr>
			<td><lable>Patient Date of Birth</lable></td>
			<td><form:input path="patientDateOfBirth" /></form></td>
		</tr>
		<tr>
			<td><lable>Appointment Date</lable></td>
			<td><form:input path="appointmentDate" /></form></td>
		</tr>
		<tr>	
			<td><lable>Doctor Id</lable></td>
			<td><form:input path="doctorId" /></form></td>
		</tr>
			
			
			
		
		
		</tbody>
	
	</table>
	<input type="submit" value="Save"
		class="save"
		/>
	
	</form:form>
	
	<div style="clear; both;"></div>
	<p>
	<a href="${pageContext.request.contextPath}/doctors/list">Back to home page</a>
	
	</p>
	
	
	</div>
	
	</div>
	
</body>


</html>