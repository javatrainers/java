
public class Phone {
	
	public void callNumber() throws InvalidPhoneNumberException {
		long contactNumber=12;
		if(contactNumber < 1000000000 || 
				contactNumber > 9999999999l
				)
			throw new InvalidPhoneNumberException
			("dialed number must be within 1000000000 - 9999999999 range");
			
			
	}
}
