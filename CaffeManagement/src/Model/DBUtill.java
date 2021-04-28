package Model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

public class DBUtill {
	public static Connection getMySqlConnection(){
//		DB연결만을 위한 클래스.
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://192.168.55.5:3306/coffeemanagement?useUnicode=true&characterEncoding=UTF-8";
			String user = "coffee";
			String password = "0000";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결성공!");
			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 클래스가 없거나 로드할 수 없습니다.<br/>");
		} catch(MySQLSyntaxErrorException e) {
			System.out.println("데이터베이스가 없거나 이름이 올바르지 않습니다.<br/>");
		} catch(SQLException e) {
			System.out.println("데이터베이스 연결 정보가 올바르지 않습니다.<br/>");
		}
		return conn;
	}
//	쿼리문을 실행하는 작업이 끝나면 close함수를 호출하여 연결을 끊어준다.
	public static void close(Connection conn) {
		if(conn != null) { try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} }
	}
	
}
