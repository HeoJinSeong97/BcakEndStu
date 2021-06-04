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
<%
	request.setCharacterEncoding("utf-8");
	String item = request.getParameter("mtxt");
	
	ArrayList<String> manager = (ArrayList)session.getAttribute("managerL");
	if(manager==null){
		manager = new ArrayList<String>();
		session.setAttribute("managerL", manager);
	}
	manager.add(item);
	%>
	<script type="text/javascript">
		alert("공지가 추가되었습니다.");
	</script>
	<%response.sendRedirect("index.jsp"); %>
</body>
</html>