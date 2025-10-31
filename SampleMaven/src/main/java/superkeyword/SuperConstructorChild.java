package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	public SuperConstructorChild(int a)
    {//prints default constructor
    	System.out.println(a);
    }
	public SuperConstructorChild(String n)
    {
		this(4);
    	System.out.println(n);
    }
	public SuperConstructorChild() 
	{  super("This");
		//super();
		System.out.println("This is a child class constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj = new SuperConstructorChild();
		SuperConstructorChild obj1 = new SuperConstructorChild("swathy");
	}

}
