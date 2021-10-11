package javaTutorial.Threads;

import java.util.Date;

public class Thread4  extends Thread{
	public void run() {
		System.out.println("in thread 4");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000l ==0 )
			{
				System.out.println(new Date()+"thread4 counted to  billion");
				break;
			}
		}
		
	}}
