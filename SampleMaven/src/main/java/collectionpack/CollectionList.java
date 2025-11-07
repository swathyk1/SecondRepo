package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<String> li = new ArrayList<String>();
    //add method - to add an element/object into the collection
    li.add("Red");
    li.add("Green");
    li.add("blue");
    System.out.println(li);
    //set - to insert new element based on index
    System.out.println(li.set(2, "orange"));
    System.out.println(li);
    //indexOf - to return index of an element
    System.out.println(li.indexOf("Red"));
    li.add("Red");
    System.out.println(li);
    System.out.println(li.indexOf("Red"));
    //lastIndexOf
    System.out.println(li.lastIndexOf("Red"));
    //remove - to remove an element from a particular index
    li.remove(2);
    System.out.println(li);
    //get - to get an element from particular index
    System.out.println(li.get(1));
    //contains - to check whether a element i present in list/collection. returns boolean value
    System.out.println(li.contains("Green"));
    System.out.println(li.contains("Orange"));
    //isEmpty - to check whether collection is empty. if empty true
    System.out.println(li.isEmpty());
    //size() - to find the length
    System.out.println(li.size());
    for(int i = 0; i<li.size();i++) {
    	System.out.println(li.get(i));
    }
    for(String c1:li) {
    	System.out.println(c1);
    }
	}

}
