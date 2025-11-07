package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> a1 = new ArrayList<String>();
    //add()
  
    a1.add("orange");
    a1.add("yellow");
    a1.add("black");
    System.out.println(a1);
    
    ArrayList<String> a2 = new ArrayList<String>();
    //add()
    a2.add("red");
    a2.add("green");
    a2.add("blue");
    
    System.out.println(a2);
    //addAll() - add 2 list / combine 2 list
    System.out.println(a1.addAll(a2));
    System.out.println(a1);
    
    //containsAll() - to check a list present in another list
    
    System.out.println(a1.containsAll(a2));
    System.out.println(a2.containsAll(a1));
    
    Iterator<String> it = a1.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    
    it.remove();
    System.out.println(a1 ); //need to create new iterator for removing the elments again
    
	}

}
