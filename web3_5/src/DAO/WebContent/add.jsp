<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="user" class="DO.LoginDO"/>
<jsp:setProperty property="*" name="user"/>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>등록내용</h2>
<p>이름 : <%=user.getName() %></p>
<p>번호 : <%=user.getPhone() %></p>
<p>성별 : <%=user.getGender() %></p>
<jsp:useBean id="ml" class="MemberList" scope="application" />
<% ml.add(user); %>
<a href="JDBCtest.jsp">등록한 사람들의 목록</a>
</body>
</html>