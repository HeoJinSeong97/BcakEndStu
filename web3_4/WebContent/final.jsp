<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><%=session.getAttribute("name") %>님, 결제하실 상품 목록입니다.</h1>
	<%
	request.setCharacterEncoding("utf-8");
	ArrayList<String> list =  (ArrayList)session.getAttribute("itemL");
	if(list == null){
		out.print("상품이 존재하지 않습니다.");
	}else{
		for(String s : list){
			out.println(s+"<br>");
		}
	}
	%>
	<input type="button" value="돌아가기" onclick="javascript:history.go(-1)">
</body>
</html>