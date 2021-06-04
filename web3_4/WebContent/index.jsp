<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1_메인화면</title>
</head>
<style>
*{text-align: center; margin: 0 auto;}
</style>
<body>
<h1>스타벅스</h1>
<form action="menu.jsp">
<p><input type="text" name="name"><input type="submit" value="Login"></p>
<br>
<hr>
<%ArrayList<String> list= (ArrayList)session.getAttribute("managerL"); %>
<%
if(list!=null){%>
<ol>
<%
	for(String s : list){
		out.print("<li>"+s+"</li>");
	}%>
</ol>
<%
}
%>
</form>
</body>
</html>