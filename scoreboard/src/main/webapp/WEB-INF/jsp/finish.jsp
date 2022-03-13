<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<table>
		<thead>
			<tr>
				<th>Team Name</th>
				<th>Score</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${teams}" var="teams">
				<tr>
					<td>${teams.teamName}</td>
					<td>${teams.score}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<table>
		<!-- <tr>
        				<td>Click to Reset  score card<strong></td>
        				<td><a href="/finish">FINISH</a></strong></td>
        			</tr> -->
		<tr>
			<td>Click to Remove score card <strong></td>
			<td><a href="/start">RESET</a></strong></td>
		</tr>
		<tr>
			<td>Click to See the Summary <strong></td>
			<td><a href="/">Summary</a></strong></td>
		</tr>

	</table>
</body>
</html>