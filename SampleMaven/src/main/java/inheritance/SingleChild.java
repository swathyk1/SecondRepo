package inheritance;

public class SingleChild extends SingleParent{
    public void displayc()
    {
    	System.out.println("This is a child class");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SingleChild obj = new SingleChild();
     obj.displayc();
     obj.display();
     SingleParent obj1 = new SingleParent();
     obj.display();
     }

}
