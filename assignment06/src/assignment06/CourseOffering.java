package assignment06;

import java.util.ArrayList;

public class CourseOffering {
	private String name,title;
	private int semester;
	ArrayList<String> annotations = new ArrayList<String>();
	public CourseOffering(String name, String title, int semester, ArrayList<String> annotations) {
		super();
		this.name = name;
		this.title = title;
		this.semester = semester;
		this.annotations = annotations;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public ArrayList<String> getAnnotations() {
		return annotations;
	}
	public void setAnnotations(ArrayList<String> annotations) {
		this.annotations = annotations;
	}
}
