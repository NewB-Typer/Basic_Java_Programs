package exam.Practise.MULTIthreading;

public class SynchronizeD {
	public synchronized void bike() {
for(int i=4 ; i>0 ; i--) {
	System.out.println(Thread.currentThread().getName() + " is Using the Bike");
try { Thread.sleep(1500);} catch(InterruptedException x) {}
}
		}	
public static void main(String[] args) {
	SynchronizeD s = new SynchronizeD();
	Thread babu = new Thread("Babu") {
		public void run() {
		s.bike();	
		}
	};

	Thread bullet = new Thread("Bullet") {
		public void run() {
		s.bike();
		}
	};
	babu.start();
	bullet.start();
	
}
}
