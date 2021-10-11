import java.io.File;
import java.io.IOException;

public class ExceptionHandlingTest {

	public static void main(String[] args) throws Exception{
	
		ExceptionHandling eh=new ExceptionHandling();
		eh.method1();
	
		
		
		
		
	Phone p=new Phone();
	try {
		p.callNumber();
	} catch (InvalidPhoneNumberException e) {
		e.printStackTrace();
	}
	
	BnkAccountExc bank=new BnkAccountExc();
	try {
		bank.withdraw();
	} catch (InsufficientFundException e) {
		e.printStackTrace();
	}
		
		/*
		ExceptionHandling eh=new ExceptionHandling();
			try {
				eh.method1();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		/*
		// exception line
		int a=10/0; // runtime exception
		
		File f=new File("x:/hi.txt");
		// exception line
		try {
			f.createNewFile(); // compile time or checked exception
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		int i=10;
		int j=2;
		String [] names= {"john","jane"};
		// exception line
		System.out.println( names[3]); // runtime exception
		
		try {
			System.out.println("1");
			int k=i/4;
			System.out.println("2");
			
						// guranteed completion, if NO problem occurs
		}
		
		catch(ArithmeticException ae){ // guaranteed block if problem occurs
			System.out.println("3");
			System.out.println("please do not divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("4");
			System.out.println("please do not access outside array index");
		}
		catch(Exception e) {
			
		}
		catch(Throwable t) {
			
		}
		finally { // guaranteed block, ALWAYS
			System.out.println(" Thank you for using XYZ software ");
		}
		
		
		/*
		try {
		ExceptionHandling eh=new ExceptionHandling ();
		eh.method1();
		}catch(Exception e) {
			System.out.println("System is facing some technical difficult, please try again later");
		}
		*/
	}

}
