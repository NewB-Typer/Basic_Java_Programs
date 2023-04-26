package ai.stha.youtube.finalKeyword;

public class FinalMethodChild extends FinalMethod{
	
/*	void method1(){
	}
	-- cannot override due to the use of final keyword in the method in parent class
	*/
public static void main(String[] args) {
	FinalMethodChild fmc = new FinalMethodChild();
	fmc.method1();
	
	
	
}
}
