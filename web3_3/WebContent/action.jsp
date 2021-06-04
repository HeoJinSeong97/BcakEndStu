<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다른 페이지</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
	%>
	<p>User&nbsp;&nbsp;: <%=name %></p>
	<p>Tel&nbsp;&nbsp;&nbsp;&nbsp;: <%=phone %></p>
	<p>email&nbsp;: <%=email %></p>
</body>
</html>