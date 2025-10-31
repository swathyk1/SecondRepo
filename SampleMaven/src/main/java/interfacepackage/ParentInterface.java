package interfacepackage;

public interface ParentInterface {
    public static final int a=10;
    //int b= 20;
    //b=30;
  
	public abstract void display();
	
	public static void dispOne() {
		System.out.println("This is a static methode from parent");
	}
    default void dispTwo() {
        
    	System.out.println("This is a default method from parent");
    }
}
