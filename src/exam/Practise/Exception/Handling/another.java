package exam.Practise.Exception.Handling;

public class another {
public static void main(String[] args){
	int a = 0;
	int b = 3;
	try {
	int	div = b/a;
	System.out.println(div);
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println("You cannot divide by 0");
	}
	finally{
		System.out.println("Finally block just prints whatsoever");
	}
	
	
}
}
