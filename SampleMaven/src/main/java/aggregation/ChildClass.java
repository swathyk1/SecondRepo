package aggregation;

public class ChildClass {
	String state;
    String city;
    ParentClass ref;
	public ChildClass(String state, String city,ParentClass ref) 
	{
		this.state = state;
		this.city = city;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(state+" " +city);
		System.out.println(ref.name+" "+ref.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass obj1 = new ParentClass("Swathy",20);
		ChildClass obj = new ChildClass("Kerala","Tvm",obj1);
		obj.display();
	}

}
