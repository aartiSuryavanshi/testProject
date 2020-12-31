<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
<title>List of Appointments</title>


<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css"/>

</head>
<body>
<div id="wrapper">
	<div id="header" >
	<h2>Appointment list</h2>
	</div>
	<div>
		<table>
		<tr>
		<th>Serial No</th>
		<th>Patient Name</th>
		<th>Email Id</th>
		<th>Patient Mobile No</th>
		<th>patient Date Of Birth</th>
		<th>Appointment Date</th>
		<th>Doctor Id</th>
		<th>Action</th>
		</tr>
		<c:forEach var="tempappointment" items="${appointment}">
		
			<c:url var="updateLink" value="/doctors/showFormForUpdate">
			<c:param name="serialNo" value="${tempappointment.serialNo}" />
			</c:url>
			
			
			<c:url var="deleteLink" value="/doctors/delete">
			<c:param name="serialNo" value="${tempappointment.serialNo}" />
			</c:url>
			
		<tr>
		<td>${tempappointment.serialNo}</td>
		<td>${tempappointment.patientName}</td>
		<td>${tempappointment.emailid}</td>
		<td>${tempappointment.patientMobileNo}</td>
		<td>${tempappointment.patientDateOfBirth}</td>
		<td>${tempappointment.appointmentDate}</td>
		<td>${tempappointment.doctorId}</td>
		<td>
		<a href="${updateLink}">Update </a>
		|
		<a href="${deleteLink}"
		onclick="if(!(confirm('Are you sure you want to delete appointment?'))) return false"
		
		>Delete</a>
		</td>
		</tr>
		</c:forEach>
		
		</table>
		
		
		</div>
	
	 </div>



</body>

</html>