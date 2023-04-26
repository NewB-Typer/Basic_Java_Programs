package exam.Practise;

public class OverrRiding extends ParentRider{
public void tuto() {
	System.out.println("This is Function Overriding");
}
	
	
public static void main(String[] args) {
	//Instantiating Parent objects call parent's declaration 
	ParentRider pr = new ParentRider();
pr.tuto();
	

//After overriding
OverrRiding or = new OverrRiding();
or.tuto();
}
}
