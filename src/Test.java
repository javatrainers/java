
public class Test {
	static int x; // default 0
	String s; // default null
	
	public static void main(String argsp[]) {
		int y; // no default
		System.out.println(x);
		int z=x;
		x++;
		if(true) {
			int a=30;
			if(true)
				System.out.println(a);
		}
		else {
			System.out.println(a);
		}
		
		
	}
	int y;
	public boolean m(int a, int b) {
		int y;
		int a=10;
		
		if(a==b)
			return true;
		else if (a>b)
			return false;
		else if (a<b)
			return false;
		else
			return false;
			

		
		
	}
}
