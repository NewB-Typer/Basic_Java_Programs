package exam.Practise.MULTIthreading;

public class FinalSynchronized {
public synchronized void sync() {
for(int i=0; i<4 ; i++) {
	
	System.out.println( Thread.currentThread().getName() + " is ahead , this time");
	}
try {Thread.sleep(1200);} catch(InterruptedException x) {}
}
	public static void main(String[] args) {
		
FinalSynchronized fs = new FinalSynchronized();
Thread Don = new Thread("Don") {
public void run() {
fs.sync();	
}
};

Thread Dada = new Thread("Dada") {
	public void run() {
	fs.sync();
	}
};
	
Don.start();
Dada.start();
	}
}
