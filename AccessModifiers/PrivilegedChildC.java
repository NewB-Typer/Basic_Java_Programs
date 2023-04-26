package ai.stha.youtube.AccessModifiers;
// example for the same package

public class PrivilegedChildC extends Privileges{
public static void main(String[] args) {
	Privileges plz = new Privileges();
	System.out.print(plz.pub);
	System.out.print(plz.def);
	System.out.print(plz.pro);	
	// System.out.print(plz.priv); same here, private String is not visible here
}
	}

	

