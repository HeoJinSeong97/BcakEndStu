package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Controll {
	Connection conn = null;
	public Controll(){
		conn = DBUtill.getMySqlConnection();
	}
	public void insert(String name, String phone, String gender) throws SQLException{
		String sql = "insert into kimdb(name, phone, gender) values(?,?,?)";
		conn.createStatement();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, phone);
		pstmt.setString(3, gender);
		pstmt.executeUpdate();
	}
}
