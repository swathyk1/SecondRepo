package stringName;

public class StringPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="hello";
      String s2="He";
      String s3="";
      System.out.println(s);
      String s1=new String("hii");
      System.out.println(s1);
      //charAt-return char in a string
      char c=s.charAt(1);
      System.out.println(c);
      //length() - to return the size of the string
      System.out.println(s.length());
      //concat() - add 2 string
      System.out.println(s.concat(s1));
      //contains - to check whether a word or char present in the string.if present, return true value else false value
	  System.out.println(s.contains(s1));
	  System.out.println(s.contains("h"));
	  //toUppercase - convert small cases to uppser case
	  System.out.println(s.toUpperCase());
	  //toLowerCase - convert capital to lowercase letters
	  System.out.println(s2.toLowerCase());
	  //isEmpty - check string is empty or not
	  System.out.println(s.isEmpty());
	  System.out.println(s3.isEmpty());
	  //valueof - to convert any datatype to string
	  int s4= 20;
	  System.out.println(String.valueOf(s4));
	  //equals
	  String s5= "java";
	  String s6="Java";
	  String s7="java";
	  String s8="selenium";
	  System.out.println(s5.equals(s6));
	  System.out.println(s5.equals(s7));
	  System.out.println(s5.equals(s8));
	  //equalsIgnoreCase()
	  System.out.println(s5.equalsIgnoreCase(s6));
	  System.out.println(s5.equalsIgnoreCase(s7));
	  //== operator 
	  System.out.println(s5==s7);//s5 and s7 stored in literal
	  String s9 = new String("java");
	  System.out.println(s5==s9);//checks the reference. s5 is stored in literal(constant pool) and s9 in new keyword(heap memory)
	  
	}

}
