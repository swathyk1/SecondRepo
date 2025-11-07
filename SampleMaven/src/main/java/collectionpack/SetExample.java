package collectionpack;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<String> s =new HashSet <String>();
    s.add("apple");
    s.add("mango");
    s.add("lemon");
    System.out.println(s);
    //addAll(). contains() , containsAll() , remove , size() ,clear
    
    Set<String> s1 =new HashSet <String>();
    s1.add("watermelon");
    s1.add("muskmelon");
    s1.add("pineapple");
    System.out.println(s1);
    System.out.println(s.addAll(s1));
    System.out.println(s);
    
    s1.clear();
    System.out.println(s1);
    System.out.println(s1.isEmpty());
    
    s.add("apple");
    System.out.println(s);
    
    
	}

}
