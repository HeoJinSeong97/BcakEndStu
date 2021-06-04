package member;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.Controll;
import DO.LoginDO;

public class MemberList  {
	// DB와 연동을 하지않고있어, 그 역할을 대신하는 클래스
	   Controll cn = new Controll();
	   public void add(String name, String phone, String gender) throws SQLException {
	    cn.insert(name, phone, gender);
		System.out.println(name+"님, 등록완료!");
	   }

}
