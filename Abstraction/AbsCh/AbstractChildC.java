package ai.stha.youtube.Abstraction;

public class AbstractChildC extends AbstractC{

	// WE are overriding two abstract methods from an abstract class 
	@Override
	public void method1(){
	System.out.print("Defining method 1 in child class");
}
public void method2(){
	System.out.print(" \n Defining method 2 in child class ");
}
public static void main( String[] args) {
	AbstractChildC acc = new AbstractChildC();
	
	// we are calling normal method of an abstract class .i.e methodDef
	acc.methodDef();
	
	
	acc.method1();
	acc.method2();
	
	
}
}
