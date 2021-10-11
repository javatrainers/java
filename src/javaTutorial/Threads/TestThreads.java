package javaTutorial.Threads;

import java.util.Date;

public class TestThreads {
	public static void main(String args[]) throws Exception {
	// this is the main thread where JVM started execution	
		System.out.println("Main thread starts :");
		/*
		Alarm alarm1=new Alarm(1, "Alarm one");
		Alarm alarm2=new Alarm(2, "Alarm two");
		alarm1.start();
		alarm2.start();
		Date ThreadStartTime=new Date();
		System.out.println("Main thread start all Alarm threads at :"+ThreadStartTime);
	
		// this main thread will halt until the alarm1 thread finishes the execution
		// the main thread should halt until all the alarm thread finish the job
		alarm1.join();
		alarm2.join();
		System.out.println("Main thread can resume since all alarm threads did end");
		System.out.println("main thread exits");
	
	 */ 
		//
		PriorityCounter a=new PriorityCounter("thread1");
		PriorityCounter b=new PriorityCounter("thread2");
		PriorityCounter c=new PriorityCounter("thread3");
		//PriorityCounter d=new PriorityCounter("thread4");
		//PriorityCounter e=new PriorityCounter("thread5");
// thread c has the highest priority and will be granted more cpu execution time , hence will count more.
// windows has 10 as the max priority and 1 as the least priority. default priority is 5.
		//System.out.println("Main thread is starting all priority test threads at :"+ThreadStartTime);
		c.setPriority(10);
		
		a.start();
		b.start();
		c.start();
		//d.start();
		//e.start();
		System.out.println("Main thread ends now");
	}

}
