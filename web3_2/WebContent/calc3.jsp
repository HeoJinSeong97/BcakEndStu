<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="cb" class="test.CalcBean" />
	<jsp:setProperty property="*" name="cb" />
	<%cb.calc();%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>계산기3</h1>
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
    <p>계산 결과: <jsp:getProperty property="result" name="cb"/> </p>
</body>
</html>