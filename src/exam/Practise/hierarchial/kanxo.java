package exam.Practise.hierarchial;

public class kanxo extends baau{
	int paisa = 20;
public static void main(String[] args) {
	
	kanxo k = new kanxo();
	
	System.out.println("Baau ko paisa: " + k.bpaisa );
	System.out.println("Kanxo ko paisa: " + (k.bpaisa + k.paisa));
	
}
}
