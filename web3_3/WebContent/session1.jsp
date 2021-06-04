<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8"); %>
<%if(session.isNew()){
	session.setAttribute("name", "홍길동");
	session.setMaxInactiveInterval(30);
	out.println("<script>alert('세션설정')</script>");
}%>
<%=session.getAttribute("name") %>님, 환영합니다.<br>
<%=session.getId()%><br>
<%=session.getMaxInactiveInterval() %><br>

</body>
</html>