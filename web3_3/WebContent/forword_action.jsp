<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재페이지</title>
</head>
<body>
	<p>현재페이지에서 출력하는 메시지</p>
	<jsp:forward page="action.jsp">
		<jsp:param value="홍길동" name="name"/>
		<jsp:param value="010-1234-5678" name="phone"/>
		<jsp:param value="hong@naver.com" name="email"/>
	</jsp:forward>
</body>
</html>