package exam.Practise.MULTIthreading;

public class ThreadSync {
public synchronized void top() {
	for(int z= 5; z>0; z--) {
System.out.println(Thread.currentThread().getName() + " is running Thread : " + Thread.currentThread().getPriority());	
	}
	try {
		Thread.sleep(1100);
	} catch(InterruptedException k) {
		
	}
}
	public static void main(String[] args) {
	ThreadSync ts = new ThreadSync();
	Thread hb = new Thread("Haribahadur ") {
		public void run() {
		ts.top();	
		}
	};
	
	Thread mb = new Thread("MadanBahadur ") {
		public void run() {
		ts.top();	
		}
	};
	
	hb.setPriority(8);
	mb.setPriority(3);
	
	hb.start();
	mb.start();

	System.out.println(hb.isAlive());
	System.out.println(mb.isAlive());
	}
}
