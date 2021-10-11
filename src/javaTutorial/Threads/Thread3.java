package javaTutorial.Threads;

import java.util.Date;

public class Thread3  extends Thread{
	public void run() {
		System.out.println("in thread 3");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000l ==0 )
			{
				System.out.println(new Date()+"thread3 counted to  billion");
				break;
			}
		}
		
	}}
