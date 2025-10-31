package inheritance;

public class MultiChild extends MultiIntermediate {
    
	public void displaychild()
	{
		System.out.println("This is a multi child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild obj = new MultiChild();
		obj.displaychild();
		obj.display();
		obj.displayp();
	}

}
