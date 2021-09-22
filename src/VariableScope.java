
public class VariableScope {
	int x;// DEFAULT VALUES
	int a=20; // global scope
	String name="john"; // long term information
	// parameteric variable
	// begin { of the method and ends on
	// } of the method
	int z=10;
	
	public void conflict() {
		// local variable = NO CONFLICT ALLOWED
		// local vs global = CONLICT ALLOWED
		{
			int z=20;
			//System.out.println( z );
			System.out.println( this.z );
		}
	}
	
	
	public void test(int b) {
		System.out.println(a);
		int c=30; // local scope
		{
			int d=1; // NO DEFAULT VALUES
			System.out.println(d);// USE
			int z=d;
			{
				
			}
		}
		
	}
	// nested block
	public void test2(int x) {// method block
		{ // block 1
			// notice the immediate 
			// opening bracket above
			int y=10;
			System.out.println(y);
			// from line it was declared = 21
			// till the end of its block = 29
			{ // block 2
				//int x;
				int p=30;
				System.out.println(p);
				{ // block 3
			//		int p=30;
				}
			}
			int p;
		}
		//System.out.println(p);
	}	
}