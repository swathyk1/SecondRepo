package inheritance;

public class HierChildTwo extends HierParent {
    public void displayct()
    {
    	System.out.println("This is second child");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierChildTwo hct = new HierChildTwo();
		hct.displayct();
		hct.displayp();
	}

}
