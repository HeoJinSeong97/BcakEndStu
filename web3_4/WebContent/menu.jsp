<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2_주문화면</title>
</head>
<body>
<%
String name = request.getParameter("name");
if(name != null){
	session.setAttribute("name", name);
}
if(name.equals("관리자")){
	session.setAttribute("manager", name);
}
%>
<jsp:include page="manager.jsp"></jsp:include>

<h1><%=session.getAttribute("name") %>님, 안녕하세요!</h1>

<form action="add.jsp">
	<select name="item">
		<option>상의</option>
		<option>자켓</option>
		<option>하의</option>
		<option>신발</option>
	</select>
	<input type="submit" value="추가하기">	
</form>
	<a href="final.jsp">주문하기</a>
</body>
</html>