package poly;

public class Main {
public static void main(String[] args) {
	
	Football football = new Football();
	Volleyball volleyball = new Volleyball();
	Rugby rugby = new Rugby();
	
	//Polymorphism
	Ball [ ] all = {football, volleyball, rugby};
//using for each loop
	for (Ball x : all ) {
		x.property();
	}
}
}
