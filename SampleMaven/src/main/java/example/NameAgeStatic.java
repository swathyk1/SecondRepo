package example;

public class NameAgeStatic {
	// Static variables to hold name and age
    static String name;
    static int age;

    // Static method to set name and age
    public static void setInfo(String n, int a) {
        name = n;
        age = a;
    }

    // Static method to get (display) name and age
    public static void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set values using the static method
        setInfo("Alice", 25);

        // Get (print) values using the static method
        getInfo();
	}

}
