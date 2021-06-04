<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<jsp:useBean id="login" class="DO.DO"/>
<jsp:setProperty property="*" name="login"/>
<html>
<head>
<meta charset="UTF-8">
<title>로그인성공여부</title>
<script type="text/javascript"></script>
</head>
<body>
<%
	if(login.check()){
		out.print("<h3>로그인 성공</h3>");	
	}else{
		%>
		<script type="text/javascript">
		alert('로그인 실패');
		history.go(-1);
		</script>
		<%	
	}
%>
<jsp:getProperty property="id" name="login"/>
<jsp:getProperty property="pw" name="login"/>
</body>
</html>