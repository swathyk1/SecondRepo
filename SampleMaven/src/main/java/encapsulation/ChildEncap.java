package encapsulation;

public class ChildEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentEncap obj = new ParentEncap();
		obj.setAge(20);
		System.out.println(obj.getAge());
		obj.setName("Swathy");
		System.out.println(obj.getName());
	}

}
