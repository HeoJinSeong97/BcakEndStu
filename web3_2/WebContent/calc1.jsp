<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	int result=0;
	
	if(request.getMethod().equals("POST")){
		String op = request.getParameter("op");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		if(op.equals("+")){result=num1+num2;}
		if(op.equals("-")){result=num1-num2;}
		if(op.equals("*")){result=num1*num2;}
		if(op.equals("/")){result=num1/num2;}
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>계산기</h1>
    <form method="post">
        <input type="text" name="num1">
        <select name="op" id="">
            <option selected value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        <input type="text" name="num2">
        <input type="submit" value="=">
    </form>
    <hr>
    <p>계산 결과: <%=result%></p>
</body>
</html>