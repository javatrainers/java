package javaTutorial.Threads;

import java.util.Date;
import java.util.HashSet;

public class TestAlarm {
	
	public static void m() {
		String[] s=new String[5];
		System.out.println( s[0] );
		System.out.println( s[1] );
		System.out.println(  s[0].equals(s[1]));
		String name="john"; // john
		name = name +" jane";// john jane
		name = name.replace("j", "k"); // kohn kane
		name=name.substring(5);
		System.out.println(name);
		
		
		// throwable > exception > runtimeexception > arithemti
	}
	public static void main(String args[]) {
		m();
		Alarm alarm1=new Alarm(2, "Alarm one");
		alarm1.start();
		alarm1.start();
		HashSet<Stock> showroom=new HashSet<Stock> ();
		Stock s1=new Stock();
		showroom.add(s1);
		
		/*
		Alarm alarm1=new Alarm(2, "Alarm one");
		Alarm alarm2=new Alarm(4, "Alarm two");
		Alarm alarm3=new Alarm(4, "Alarm three");
		Alarm alarm4=new Alarm(4, "Alarm four");
		Alarm alarm5=new Alarm(6, "Alarm five");
		
		// thread 2,3,4 all finish at the same time. priortize thread # 3.. 
		//  so thread 3 finish first ( among 2,3,4 ) all the time
		// below is not an ideal test for thread priority. since thread 2 was started before 3 and 4
		alarm3.setPriority(10);
		
		alarm1.start();
		alarm2.start();
		alarm3.start();
		alarm4.start();
		alarm5.start();

		
		Date ThreadStartTime=new Date();
		System.out.println("All threads started running at :"+ThreadStartTime);
		*/
	}

}
