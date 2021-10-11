package javaTutorial.Threads;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("in main start");
		Thread1 t1=new Thread1();
		t1.start(); // start = being new thread/path of execution
		Thread2 t=new Thread2();
		Thread t2=new Thread(t);
		t2.start();
		Thread3 t3=new Thread3();
		t3.start(); // start = being new thread/path of execution
		Thread4 t4=new Thread4();
		t4.start(); // start = being new thread/path of execution
		Thread5 t5=new Thread5();
		t5.start(); // start = being new thread/path of execution
		
		t1.setPriority(10);
		t3.join(1000); // 1000 milli second waiting 
		// t3.join(); // endless waiting 
		
		t4.stop();
		System.out.println("in main end");
	}

}
