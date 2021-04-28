package webDay3;

public class StuController {
	
	Student model;
	StuView view;
	
	public StuController(Student model, StuView view) {
		this.model = model;
		this.view = view;
	}
	public StuController(Student model) {
		this(model, new StuView());
	}
	public void updateView() {
		this.view.printStu(this.model);
	}
	
}
