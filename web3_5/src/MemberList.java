import java.sql.SQLException;
import java.util.ArrayList;

import DAO.Controll;
import DO.LoginDO;

public class MemberList  {
	// DB와 연동을 하지않고있어, 그 역할을 대신하는 클래스
	   ArrayList<LoginDO> list=new ArrayList();
	   Controll cn = new Controll();
	   public void add(LoginDO mem) {
	      list.add(mem);
	      try {
			cn.insert(mem.getName(), mem.getPhone(), mem.getGender());
			System.out.println(mem.getName()+"님, 등록완료!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }

	   public ArrayList<LoginDO> getList() {
	      return list;
	   }
}
