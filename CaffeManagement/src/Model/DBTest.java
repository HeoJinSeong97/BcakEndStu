package Model;

import java.sql.Connection;

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DBUtill.getMySqlConnection();
		DBUtill.close(conn);
	}

}
