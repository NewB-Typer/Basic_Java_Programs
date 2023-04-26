package exam.Practise.MULTIthreading;

public class SEcond implements Runnable{
	public void run() {
		SEcond.go();
	}
	public static void go() {
		for(int i = 0; i < 4 ; i++ ) {
System.out.println(" Thread Name: " + Thread.currentThread().getName());
System.out.println(" Thread Priority: " + Thread.currentThread().getPriority());
try {
	Thread.sleep(1000);
}catch(InterruptedException z) {
		}
		}
	}
public static void main(String[] args) {
	SEcond s = new SEcond();
	Thread mt1 = new Thread(s);
	Thread mt2 = new Thread(s);
	
	mt1.setName("SUPERMAN");
	mt2.setName("BATMAN");
	
	mt1.start();
	mt2.start();
	s.go();
	
	
}
}
