package Sharpen;

public class GuessingGame {
public void Start() {
	GuessingPlayers	p1 = new GuessingPlayers();
	GuessingPlayers	p2 = new GuessingPlayers();
	GuessingPlayers p3 = new GuessingPlayers();

	int target = (int) (Math.random() * 10);
	System.out.println("Thinking number between 0 and 9 ...");
	
	while(true) {
		System.out.println("Target is " + target);
		
    	p1.guess();
		p2.guess();
		p3.guess();
		
	int guessp1 = p1.number;
		System.out.println("Player one guessed " + guessp1);
	int guessp2 = p2.number;
		System.out.println("Player two guessed " + guessp2);
	int guessp3 = p3.number;
		System.out.println("Player three guessed " + guessp3);
	
	if(guessp1 == target) {
	System.out.println("Player one got the correct number!!");
	break;
	}
	else if(guessp2 == target) {
		System.out.println("Player Two got the correct number!!");
	break;
	}
	else if(guessp3 == target) {
		System.out.println("Player Three got the correct number!!");
	break;} 
	else{System.out.println("Trying another round..");
	System.out.println();	}	
	}
}
}
