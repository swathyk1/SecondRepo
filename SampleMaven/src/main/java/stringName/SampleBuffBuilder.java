package stringName;

public class SampleBuffBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		StringBuilder sbs = new StringBuilder("Swathy");
		System.out.println(sbs);
		//insert - to insert word on index base
		sb.insert(5, "s");
		System.out.println(sb);
		//append - add new string at the end of the string
		sb.append(" swathy");
		System.out.println(sb);
		//replace - to replace specific word
		sb.replace(1, 4, "iiii");
		System.out.println(sb);
        //reverse - to reverse a string
		sb.reverse();
		System.out.println(sb);
		//delete - 
		sb.delete(7, 8);
		System.out.println(sb);
		
		
		
		// TODO Auto-generated method stub

	}

}

