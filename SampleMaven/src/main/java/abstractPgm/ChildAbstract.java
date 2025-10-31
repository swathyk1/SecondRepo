package abstractPgm;

public class ChildAbstract extends ParentAbstract{

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstract obj = new ChildAbstract();
		obj.display();
		
		System.out.println(obj.show(10));
		
		obj.showr();
	}
	public void display() {
		System.out.println("this is abstract method");
	}
	@Override
	public int show(int a) {
		// TODO Auto-generated method stub
		return a;
	}

}
