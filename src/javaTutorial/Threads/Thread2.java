package javaTutorial.Threads;

import java.util.Date;

public class Thread2 extends Object implements Runnable{
	public void run() {
		System.out.println("in thread 2");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000l ==0 )
			{
				System.out.println(new Date()+"thread2 counted to  billion");
				break;
			}
		}
		
	}
}
