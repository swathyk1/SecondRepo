package overriding;

public class ChildClass extends ParentClass {
	public void display()
	{   super.display();
		System.out.println("Child class");
	}
	public void displayOne(String name)
	{   super.displayOne("Krishna");
		System.out.println(name);
	}
	@Override   //right click->source->Override/implement methods
	public void displayTwo(String a) {
		// TODO Auto-generated method stub
		super.displayTwo("hello");
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.display();
		obj.displayOne("swathy");
		obj.displayTwo("hii");
	}

}
