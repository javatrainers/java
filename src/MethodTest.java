
public class MethodTest {

	public static void main(String[] args) {
		Methods m=new Methods();
		Person p1=new Person();
		System.out.println(p1.name);
		p1.name="jane";
		m.testing(p1);
		System.out.println(p1.name);
		/*
		int x=10;
		Person p1=new Person();
		m.test(x, p1);
		System.out.println(x);
		System.out.println(p1.name);
		m.m3(  );
		System.out.println("main ends");
		// method call
		/*
	  	PASSING INPUT
		if method requires primitive data type as input 
			you can pass literal value or variable of same type
		if method requires object data type as input
			you can pass variable of same type
		if multiple input required
			you hav to pass input in the same order
		
		HANDLING RESPONSE/RETURN TYPE
		if method returns primitive or object data type as output
			you can handle them in a variable of same type
		if method has void return : no handling required
	 */
		// number / order / type of input
		/*
		int p=m.rectangeArea( 10,20,"john" );
		
		int x=10; int y=30;
		int z=m.rectangeArea(x,y,"jane");
		
		Person p1=new Person();
		m.register( p1 );
		*/
	}

}
