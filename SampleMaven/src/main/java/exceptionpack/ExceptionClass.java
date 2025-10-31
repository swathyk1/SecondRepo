package exceptionpack;

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try
     {
    	 int a = 10; // arithmeticexception
     
         int b = 0;
         int c= a/b;
         System.out.println(c); 
     }
		catch(ArithmeticException a) 
     {
			System.out.println("Exception is handled");
			
		} 
    
     finally
     {
    	 System.out.println("This is an important code");
     }
     
   //  System.out.println("Hello");
	/*	int a[] = {1,2,2,3,3,4};  arrayexception
		for(int i=0;i<7;i++) {
			System.out.println(a[i]);
		}  */
		
	/*	String a = null;  nullpointer exception
		System.out.println(a.length()); */
	}    

}
