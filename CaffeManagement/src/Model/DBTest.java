package Model;

import java.sql.Connection;
import java.sql.ResultSet;

public class DBTest implements SQLControll{

	public static void main(String[] args) {
		// sql쿼리 실핼 필요시 사용방법.
		Connection conn = DBUtill.getMySqlConnection();
//		
//		쿼리작업란
		
//		DB연결해제
		DBUtill.close(conn);
	}

	@Override
	public ResultSet Select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete() {
		// TODO Auto-generated method stub
		
	}

}
