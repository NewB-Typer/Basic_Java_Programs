package ai.stha.youtube.finalKeyword;

public class FinalVariable {
	
	final int a = 9;
//int a = *   assigning value of a to any other value gives errorSystem.out.println("sum for = " + (var.a+var.b));
	int b = 5;
	
public static void main(String [] args) {
final int a=2;
//int a = *   assigning value of a to any other value gives errorSystem.out.println("sum for = " + (var.a+var.b));
int b=4;
System.out.println("sum for local = " + (a+b));

	FinalVariable var = new FinalVariable();
	System.out.println("sum for global = " + (var.a+var.b));
	
}
}
