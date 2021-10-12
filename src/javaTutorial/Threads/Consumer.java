package javaTutorial.Threads;

import java.util.Random;


public class Consumer implements Runnable{
	Stock demand;

	public Consumer(Stock shareProd) {
		demand=shareProd;
	}

	public void run() {
			try{
			while(true)
			{
					int buyOrder = new Random().nextInt(10 - 1 + 1) + 1;
					synchronized (demand) {
					while(demand.quantity < buyOrder) {
						System.out.println("Notify Producer OUT OF STOCK : Total stocks :"+demand.quantity+" orders placed :"+ buyOrder);
						demand.notify();// notify producer thread to start producing
						demand.wait();// wait until producer thread notifies new stock
						}
					demand.quantity=demand.quantity-buyOrder;
					}
			}
			
		}catch(Exception e)
		{
			
		}
		
	}

	public String searchAndReplace(String address)
	{
		String newAddress=null;
		boolean searc=address.contains("irving");
		if(searc){
			newAddress=address.replaceAll("irving", "dallas");
		}
		return newAddress;
		
	}
	
}
