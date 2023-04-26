package exam.Practise;

public class OverLoading {

	public int sum(int a , int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public double sum(double a , double b) {
		return a+b;
	}

	public static void main(String [] args) {
	OverLoading ov = new OverLoading();
System.out.println(ov.sum(3, 7));
System.out.println(ov.sum(3, 7,8));
System.out.println(ov.sum(3.12, 7.45));
	
	
}
}
