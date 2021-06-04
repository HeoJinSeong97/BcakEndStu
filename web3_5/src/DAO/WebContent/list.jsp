<%@page import="DO.LoginDO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>
    <jsp:useBean id="ml" class="MemberList" scope="application" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록된 사용자</title>
</head>
<body>
<h1>등록된 사용자</h1>
<%
for(LoginDO s : ml.getList()){
	out.println(s.toString()+"<br>");
}
%>
<button><a href="form.jsp">돌아가기</a> </button>
</body>
</html>