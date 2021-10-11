package javaTutorial.Threads;

import java.util.Date;

public class Thread5  extends Thread{
	public void run() {
		System.out.println("in thread 5");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000l ==0 )
			{
				System.out.println(new Date()+"thread5 counted to  billion");
				break;
			}
		}
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread5 exiting");
		
		
	}}
