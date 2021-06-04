
<%@page import="member.MemberList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
<jsp:useBean id="mem" class="DO.LoginDO" scope="application"></jsp:useBean>
<jsp:setProperty property="*" name="mem"/>
<h2>===등록내용===</h2>
<p>이름: <%String name=mem.getName(); %><%=name %></p><br>
<p>전화번호: <%String phone = mem.getPhone();%><%=phone %></p><br>
<p>성별: <%String gender=mem.getGender(); %><%=gender %></p>
<br><hr><br>
<a href="JDBCtest.jsp">등록한 사람들의 목록</a>
</body>
</html>