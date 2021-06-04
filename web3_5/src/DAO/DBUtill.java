package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtill {
	public static Connection getMySqlConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/kimdb?useUnicode=true&characterEncoding=UTF-8";
			String user = "root";
			String password = "0000";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
