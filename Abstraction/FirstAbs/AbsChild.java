package ai.stha.youtube.Abstraction;

public class AbsChild implements FirstAbs{
public void Dribble() {
	System.out.println("His dribbling is good. ");
}

public void shoot() {
	System.out.println("Shooting is below average.");
}
public static void main(String[] args) {
	
	AbsChild avs = new AbsChild();
	avs.Dribble();
System.out.println("\n");
avs.shoot();
	
	
}
}
