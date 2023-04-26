package ai.stha.youtube.polymorphism.overriding;

public class chcek extends Hanuman{
	public	void power(){
			System.out.println("You have no power. ");
		}	
		
	public static void main(String[] args) {
		chcek man = new chcek();
		
		
		man.power();
		
	}
		


}
