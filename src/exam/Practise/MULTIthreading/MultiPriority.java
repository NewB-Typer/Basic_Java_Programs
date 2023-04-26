package exam.Practise.MULTIthreading;

public class MultiPriority implements Runnable{

	public void run() {
		dark();
	}
	public static void dark() {
		for(int z = 3 ; z > 0 ; z-- ) {
			
			System.out.println(" Thread Name: " + Thread.currentThread().getName()+ "\n Priority: " + Thread.currentThread().getPriority()  );

			
			
			try { Thread.sleep(5000);
				} catch(InterruptedException d) {}
					
		}
	}
	public static void main(String[] args) {
	MultiPriority mp = new MultiPriority();
	Thread t1 = new Thread(mp);
	Thread t2 = new Thread(mp);
	
	t1.setName("Martha");
	t2.setName("Jonas");
	
	t1.setPriority(8);
t2.setPriority(4);

t1.start();
t2.start();
mp.dark();
}
}
