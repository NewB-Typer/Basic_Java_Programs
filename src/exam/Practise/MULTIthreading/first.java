package exam.Practise.MULTIthreading;

public class first implements Runnable{
@Override
	public void run(){
	print();
	}
public static void print() {
	for(int i = 5; i > 0; i-- ) {
	System.out.println(" Thread Name is "  + Thread.currentThread().getName());	

	System.out.print(" Priority is "  + Thread.currentThread().getPriority() );
	try{Thread.sleep(1000);}
	catch(InterruptedException e) {e.printStackTrace();}	
	}
}
	public static void main(String[] args) {
	first f = new first();
	Thread t1 = new Thread(f);
	Thread t2 = new Thread(f);
	
	t1.start();
	t2.start();
first.print();	
	
	
	
}
}
