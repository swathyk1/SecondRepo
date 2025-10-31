package accessmodifier;

public class Modifier {
    public void publicMethod() {
    	System.out.println("This is a public method");
    }
    
    private void privateMethod() 
    {
    	System.out.println("This is a private method");
    }
    
    protected void protectMethod()
    {
    	System.out.println("Protected Method");
    }
    
    void defaultMethod() {
    	System.out.println("Default method");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifier obj = new Modifier();
		obj.publicMethod();
		obj.privateMethod();
		obj.protectMethod();
		obj.defaultMethod();
	}

}
