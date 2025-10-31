package accessModifierTwo;

import accessmodifier.Modifier; // from another package

public class AccessSpecifierPgm extends Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifierPgm obj = new AccessSpecifierPgm();
		obj.protectMethod();
		obj.publicMethod();
		
	}

}
