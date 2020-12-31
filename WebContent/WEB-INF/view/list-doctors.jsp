<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
<title>List Doctors</title>


<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css"/>

</head>
<body>
<div id="wrapper">
	<div id="header" >
	<h2>Available Doctors</h2>
	</div>
	
	<div id="container">
		<div id="content">
		<input type="button" value="List of Appointments"
		onclick="window.location.href='showAppointsList'; return false;"
		class="add-button"
		/>
		<table>
		<tr>
		<th>Doctor Id</th>
		<th>Doctor Name</th>
		<th>Specification</th>
		<th>Availability To Time</th>
		<th>Availability From Time</th>
		</tr>
		<c:forEach var="tempDoctor" items="${doctor}">
		
		<tr>
		<td>${tempDoctor.id}</td>
		<td>${tempDoctor.doctorName}</td>
		<td>${tempDoctor.specification}</td>
		<td>${tempDoctor.availability_to_time}</td>
		<td>${tempDoctor.availability_from_time}</td>
		<td><input type="button" value="Take Appointment"
		onclick="window.location.href='showFormForTake'; return false;"
		class="add-button"
		/></td>
		</tr>
		</c:forEach>
		
		</table>
		
		
		</div>
	
	 </div>

</div>

</body>

</html>