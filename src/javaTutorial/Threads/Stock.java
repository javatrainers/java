package javaTutorial.Threads;

public class Stock {

int quantity;// 0

public void updateStock(int newStock)
{
		quantity=quantity+newStock;
		if(newStock > 0)
			System.out.println("Producer added :" + newStock+ " , total stock is :" + quantity);
		else
			System.out.println("Consumer deducts:" +  newStock+ " , total stock is :" + quantity);
}

}
