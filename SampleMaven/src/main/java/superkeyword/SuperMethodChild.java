package superkeyword;

public class SuperMethodChild extends SuperMethodParent {

	public void display()
	{   this.childdisp();
		//super.parentdisp("Swathy");
		super.show();
		System.out.println("This is a child class method");
	}
	public void childdisp()
	{
		super.parentdisp("Swathy");
		System.out.println("second method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj = new SuperMethodChild();
		obj.display();
		//obj.show();
	}

}
