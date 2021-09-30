
public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=10;
		int b;
		add(10,a);
		a=20;
		b=10;
		{
			{
			}
		}
		float x=10.0f;
		float y=10.0f;
		
		System.out.println(  a + b     );
		System.out.println(  a - b     );
		System.out.println(  x * y     );
		System.out.println(  a / b     );
		System.out.println(  a % b     );
		
		int p=20;
		int q=10;
		System.out.println(  p == q ); // false
		System.out.println(  p != q ); // true
		System.out.println(  p > q ); // true
		System.out.println(  p < q ); // false
		System.out.println(  p <= q ); // false
		System.out.println(  p >= q ); // true
		
		Person p1=new Person();
		Person p2=new Person();
		System.out.println( p1==p2 );
		System.out.println( p1.weight == p2.weight );
		
		int s=-10; // - ( -10 )
		System.out.println(   -(-(s)) );
		 // r--; // post
		 // ++r; // pre
		System.out.println("** incre/decr **");
		// 9 9 9 9 9
		
		boolean bo=false;
		System.out.println( !bo );
		int personAge=30;
		int g=10;
		int h=20;
		System.out.println(  !(g<h) );
		int l=30;
		int j=20;
		System.out.println("*** logical/conditional and ****");
		System.out.println( (g==h) && bo     );// false OR false
		
		System.out.println(   10 ^ 3 );
		
		System.out.println((2 + 1 * 3) * (3 - 4));
		System.out.println( (4 + 5 * 6) == (2*3-4) || (3-2) != (4+1));
	}
	public static int add(int a,int b) {
		return 10;
	}
}
