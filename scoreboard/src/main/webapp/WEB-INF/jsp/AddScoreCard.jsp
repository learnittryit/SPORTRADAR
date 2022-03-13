<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
	    
	<div align="center">
		        
		<h1>New/Edit Team</h1>
		        
		<form:form action="saveTeam" method="post" modelAttribute="teams">
        <table>
				<%-- <form:hidden path="id" /> --%>
				<tr>
					<td>Team A:</td>                 
					<td><form:input path="teamA" /></td>             
				</tr>
				<tr>
					<td>Score Of Team A:</td>                 
					<td><form:input path="scoreA" /></td>             
				</tr>
				            
				<tr>
					                
					<td>Team B:</td>                 
					<td><form:input path="teamB" /></td>             
				</tr>
				            
				<tr>
					                
					<td>Score Of Team B:</td>                 
					<td><form:input path="scoreB" /></td>             
				</tr>
				            
				<tr>
					                
					<td colspan="2" align="center"><input type="submit"
						value="save"></td>             
				</tr>
				        
			</table>
        </form:form>
		    
	</div>
</body>
</html>