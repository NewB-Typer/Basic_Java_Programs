package exam.Practise;
import java.util.Scanner;
public class SimplaeArea {
public static void main(String[] args) {
double PI = 3.14;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter length ");
	int l = sc.nextInt();
	
	System.out.println("Enter breadth ");
int b = sc.nextInt();

	System.out.println("Enter radius for Circle");
int r = sc.nextInt();	
	
	System.out.println("Area = " + (l*b) );
	System.out.println("Perimeter =" + (2*(l+b)));
System.out.println("Area of circle= " + (PI*r*r));


}
}
