<%@page import="DAO.DBUtill"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" import="java.sql.*"%>
<%
   request.setCharacterEncoding("UTF-8");
%>
<%
   // DB 연결관련정보
	Connection conn=null;
	PreparedStatement pstmt = null;
   try {
  	conn = DBUtill.getMySqlConnection();

      String sql = "insert into kimdb(name, phone, gender) values(?,?, 남)";
      
      pstmt = conn.prepareStatement(sql); // 3번
      if (request.getParameter("id") != null) {
         pstmt.setInt(1, Integer.parseInt(request.getParameter("id")));
         pstmt.setString(2, request.getParameter("username"));
         pstmt.executeUpdate();
      }
   } catch (Exception e) {
      e.printStackTrace();
   }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC 테스트</title>
</head>
<body>

   <h2>등록</h2>
   <form action="JDBCtest.jsp" method="post">
      아이디: <input type="text" name="id"> <br> 사용자이름: <input
         type="text" name="username"> <br> <input type="submit"
         value="등록">
   </form>

   <br>
   <hr>
   <br>

   <h2>등록된 회원 목록</h2>
   <%
      try {
         String sql="select * from kimdb";
         pstmt=conn.prepareStatement(sql);
         ResultSet rs=pstmt.executeQuery(); // 5번
         while(rs.next()){
            out.println(rs.getInt("idx")+" "+rs.getString("name")+" "+rs.getString("phone")+"<br>");
         }
         
         pstmt.close(); // 6번
         conn.close();
      } catch (Exception e) {
         e.printStackTrace();
      }
   %>

</body>
</html>