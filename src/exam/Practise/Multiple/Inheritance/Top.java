package exam.Practise.Multiple.Inheritance;

public class Top implements One,two{
	
	@Override
	public void goal(){	
		System.out.println("Goooall");	}
	
	public void Goal() {
		System.out.println("Offside");
		
	}
public static void main(String[] args) {
	
	
	Top t = new Top();
	t.goal();
	t.Goal();
	
	
}
}
