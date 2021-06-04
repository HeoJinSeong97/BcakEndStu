package DO;

public class DO {
	private String id="";
	private String pw="";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	final String dbid = "kim";//임시
	final String dbpw="1234";
	public boolean check() {
//		셋팅된 값이 DB에 있니?
		if (id.equals(dbid)&&pw.equals(dbpw)) {
			return true;
		}
		return false;
	}
}
