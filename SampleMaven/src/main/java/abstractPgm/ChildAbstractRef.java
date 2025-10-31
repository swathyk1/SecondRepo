package abstractPgm;

public class ChildAbstractRef extends ParentAbstractRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentAbstractRef obj = new ChildAbstractRef();
		obj.display();
		ChildAbstractRef obj1 = new ChildAbstractRef();//Here a default constructor is called.
		//Parent class constructor is invoked
		obj1.disp();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("parent Abstract");
	}
	 
	public void disp() {
		System.out.println("child method");
	}

}
