package webDay3;

public class Test1 {
	public static void main(String[] args) {
		Student model = StudentFromeDB();//DB ���� �����ͷε�
		
//		StuView�� �����ڷ� �����Ͽ�
//		Controller�� ������ ���ڷ� �������ȴ�.
		StuController controller = new StuController(model);
		controller.updateView();
	}
	
	static Student StudentFromeDB() {
		Student stu = new Student("ȫ�浿", 1, 80);
		return stu;
	}
	
}
