
public class Child extends Parent{
	
	int x=100;
	public int c=30;
	public void test3() {
		System.out.println("test3");
		int x=200;
		System.out.println(x);
		System.out.println( this.x );
		System.out.println( super.x );
		super.test2();
	}
	public Child() {
		super();
		System.out.println("Child is born");
		// parent constructor call
		
	}
}
