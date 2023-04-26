package dynamic_poly;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner store = new Scanner( System.in);
		Southpark sp;
		System.out.println("It is an example of Dynamic Polymorphism");
		System.out.println();
		System.out.println("Choose any of 3 below");
		System.out.println("1 = Stan -- 2 = kyle -- 3 = cartman" );
	
	int choice = store.nextInt()	;
	
if (choice == 1) {
	sp = new stan();
	sp.character();
}
else if (choice == 2) {
	sp = new kyle();
	sp.character();
}
else if (choice == 3 ) {
	sp = new cartman();
sp.character();
	}
	else {
		sp = new Southpark();
		System.out.println("Choice is invalid" );
		sp.character();
	}
store.close();	
	}

}

