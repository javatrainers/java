package javaTutorial.Threads;

import java.util.Date;

public class Thread1 extends Thread{
	public void run() {
		System.out.println("in thread 1");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000l ==0 )
			{
				System.out.println(new Date()+"thread1 counted to  billion");
				break;
			}
		}
		
	}
}

