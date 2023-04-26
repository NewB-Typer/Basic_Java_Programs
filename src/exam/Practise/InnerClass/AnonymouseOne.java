package exam.Practise.InnerClass;

abstract class blocked{
	public abstract void method0();
}

public class AnonymouseOne {
public static void main(String[] args) {
	blocked b = new blocked() {
		public void method0() {
			System.out.println("This was Blocked");
		}
		
	};
	b.method0();
	
}
}

