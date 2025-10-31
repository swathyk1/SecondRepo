package interfacepackage;

public class multiinterfaceclass implements multiinterfaceone, multiinterfaceTwo,multiinterfaceThree{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiinterfaceclass obj = new multiinterfaceclass();
		
		obj.display();
		obj.displayone();
		obj.displaythree();
	}

	@Override
	public void displaythree() {
		// TODO Auto-generated method stub
		System.out.println("interface three");
	}

	@Override
	public void displayone() {
		// TODO Auto-generated method stub
		System.out.println("interface two");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("interface one");
	}

}
