package accessmodifier;

public class ModifierTwo extends Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModifierTwo obj2 = new ModifierTwo();
		obj2.defaultMethod();
		obj2.protectMethod();
		obj2.publicMethod();
		// obj2.privateMethod();  The method privateMethod() from the type Modifier is not visible
	}

}
