package Model;

import java.sql.ResultSet;

public interface SQLControll {
	public ResultSet Select();
	public void Insert();
	public void Update();
	public void Delete();
}
