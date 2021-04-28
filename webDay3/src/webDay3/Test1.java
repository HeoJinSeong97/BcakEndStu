package webDay3;

public class Test1 {
	public static void main(String[] args) {
		Student model = StudentFromeDB();//DB 연동 데이터로드
		
//		StuView를 생성자로 생성하여
//		Controller의 생성자 인자로 보내도된다.
		StuController controller = new StuController(model);
		controller.updateView();
	}
	
	static Student StudentFromeDB() {
		Student stu = new Student("홍길동", 1, 80);
		return stu;
	}
	
}
