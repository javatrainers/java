
public class BnkAccountExc {
	int balance=100;
	// million dollar
	public void withdraw() throws InsufficientFundException {
		int amount=1000000;
		if(amount > balance)
			throw new InsufficientFundException
			("please withdraw below your balance :"+balance);
		
		
		balance = balance - amount;
		System.out.println(balance);
		// Business limitation :
		// u cannot have negative balance
	}
}
