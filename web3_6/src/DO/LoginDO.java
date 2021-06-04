package DO;


public class LoginDO {
	private String name;
	private String phone;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "[사용자 :" + name + ", 전화 :" + phone + ", 성별 :" + gender + "]";
	}
	
//	public boolean check() {
////		셋팅된 값이 DB에 있니?
//		if (id.equals(dbid)&&pw.equals(dbpw)) {
//			return true;
//		}
//		return false;
//	}
}
