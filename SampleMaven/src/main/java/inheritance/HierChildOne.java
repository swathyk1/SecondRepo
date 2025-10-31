package inheritance;

public class HierChildOne extends HierParent{
	public void childco()
	{
		System.out.println("This is child one");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierChildOne hco = new HierChildOne();
		hco.childco();
		hco.displayp();
	}

}
