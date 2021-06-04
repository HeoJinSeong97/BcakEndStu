<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8"); %>
<form action="add.jsp" method="post">
      <table border="3">
         <tr>
            <td>이름</td>
            <td><input type="text" name="name"></td>
         </tr>
         <tr>
            <td>전화번호</td>
            <td><input type="text" name="phone"></td>
         </tr>
         <tr>
            <td>성별</td>
            <td><select name="gender"><option selected>남</option>
                  <option>여</option></select></td>
         </tr>
         <tr>
            <td colspan="2" align="center"><input type="submit" value="로그인"></td>
         </tr>
      </table>
   </form>

</body>
</html>