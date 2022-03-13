<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>teams Management Screen</title>
</head>
<body>
    <div align="center">
        <h1>Teams List</h1>
        <h3>
            <a href="add"> Add Or Update Scoreboard</a>
        </h3>
        <h3>
            <a href="finish">Finish</a>
        </h3>
        <h3>
            <a href="/">Summary</a>
        </h3>
        <table border="1">
 
            <th>Team A</th>
            <th>Score A</th>
            <th>Team B</th>
            <th>Score B</th>
            
            <c:forEach var="teams" items="${teams}">
                <tr>
 
                    <td>${teams.teamA}</td>
                    <td>${teams.scoreA}</td>
                    <td>${teams.teamB}</td>
                    <td>${teams.scoreB}</td>
                    
                    <td><a href="/update?id=${teams.teamA}${teams.teamB}">Update</a>
                        <%-- <a href="deleteEmployee?id=${teams.teamA}">Delete</a> --%>
                    </td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>