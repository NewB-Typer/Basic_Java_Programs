package ai.stha.youtube.polymorphism.overloading;
public class AreaCalc {

	public double area(double l, double b)
	{
	return l*b;
}
	//overloading both area
	public double area( int r)
	{
		return Math.PI*r*r;
	}
	
	
public double parameter(double l, double b) {
	return 2*(l+b);
}
public static void main(String[] args) {
	AreaCalc a = new AreaCalc();   // This one is imp, we directly call the class name not method .i.e area
	System.out.println("Area of rectangle: " + a.area(2.11,9.3));
	System.out.println("Area of circle: " + a.area(6));
	System.out.println("Area of parameter: " + a.parameter(2.11, 9.3));
	
}
}
