<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!// calc() 선언
   int num1, num2, result = 0;
   String op = "";

   public int calc() {
      if (op.equals("+")) {
         result = num1 + num2;
      } else if (op.equals("-")) {
         result = num1 - num2;
      } else if (op.equals("x")) {
         result = num1 * num2;
      } else if (op.equals("/")){
         result = num1 / num2;
      }
      return result;
   }%>
<%
   if (request.getMethod().equals("POST")) {
      op = request.getParameter("op");
      num1 = Integer.parseInt(request.getParameter("num1"));
      num2 = Integer.parseInt(request.getParameter("num2"));
   }
%>

<html>
<head>
<meta charset="UTF-8">
<title>Calc2</title>
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
    <p>계산 결과: <%=calc()%></p>
</body>
</html>