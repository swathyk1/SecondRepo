package encapsulation;

public class ParentEncapOne {

	private int mark;
	private String grade;//right click->source->generate getter and setter
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	} 
}
