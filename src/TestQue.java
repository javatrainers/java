
public class TestQue {
	public static void main(String [] a) {
		//Car2 c=new Nissan2();
		//((Nissan2)c).drive("" ); 
		// LHS data type.. does this have the method being accessed.
		// Is there overriding ? Yes, RHS method is called
		Car2 c=new Car2(); // calling Car2 constructor
	}
}
class Car2{
	public Car2() {
		System.out.println("car manufacture");
	}
	public void drive(   ) {
		System.out.println("driving car");
	}
}
class Nissan2 extends Car2{
	public Nissan2( ) {
		super();
		System.out.println("nissan manufacture");
	}
	// public , private, protected = acces privilege
	// static final = access modifiers
	public static final int a=20;
	public void drive( String s) {
		final int x=20;
		System.out.println("driving nissan");
	}
}