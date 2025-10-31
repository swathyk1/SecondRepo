package encapsulation;

public class ChildEncapOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentEncapOne obj = new ParentEncapOne();
		obj.setMark(30);
		System.out.println(obj.getMark());
		obj.setGrade("C");
		System.out.println(obj.getGrade());
	}

}
