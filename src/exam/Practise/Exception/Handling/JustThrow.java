package exam.Practise.Exception.Handling;

public class JustThrow {
public static void main(String[] args) {
	
	int z = 3+7;
	int x = 5;
	if(z != x) {
		throw new ArithmeticException ("Galat jawaaf");
	}
	
	
}
}
