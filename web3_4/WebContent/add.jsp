<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문완료</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String item = request.getParameter("item");
	
	ArrayList<String> list = (ArrayList)session.getAttribute("itemL");
	if(list==null){
		list = new ArrayList<String>();
		session.setAttribute("itemL", list);
	}
	list.add(item+"["+new Date()+"]");
	%>
	<script type="text/javascript">
		alert("상품이 추가되었습니다."); history.go(-1);
	</script>
</body>
</html>