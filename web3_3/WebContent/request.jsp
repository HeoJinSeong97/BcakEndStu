<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   이름: <%=request.getParameter("name") %><br>
   좋아하는 과일: <%=request.getParameter("fruit") %><br>
   방문했던 여행지<br><%
      String arr[]=request.getParameterValues("place");
      for(String v:arr){
         out.println(v+"<br>");
      }
   %>

</body>
</html>