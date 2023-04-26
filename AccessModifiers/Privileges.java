package ai.stha.youtube.AccessModifiers;

public class Privileges {
	public String pub = " I am a String with public scope"; 
	// It is accessible anywhere (.i.e within or outside the package) within the current project.
	
	String def = "\n I am a String with Default scope";
	// When no specifier is given, Default is assumed .
	// It is accessible within the package
	
	protected String pro = "\n I am a protected String";
	//It is accessible  within the package but also can be accessed by the child class.
	
	private String priv = "\n I am a private String";
// only accessible within the current class only
	
	public static void main(String [] args) {
	Privileges plz = new Privileges();
	System.out.print(plz.pub);
	System.out.print(plz.def);
	System.out.print(plz.pro);
	System.out.print(plz.priv);
	}
}




class AltPrivileges{
	// This is non-public class, multiple non-public classes can be created but only one public class
	// Different class is created but within the same package
public static void main(String[] args) {
	
	// object is instantiated but from a public class
	Privileges plz = new Privileges();
	System.out.print(plz.pub);
	System.out.print(plz.def);
	System.out.print(plz.pro);
//	System.out.print(plz.priv); --> Only String with Private Privilege gives compilation error
	// This is because it is not accessible from different class 
	
}
	
}
	

