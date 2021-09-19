// source code - human readable programming instructions
//	Compiler - source code >>> binary code
// JRE - execute binary code on underlying machine
// JDK (compiler + jre) vs JRE (jre)
// binary code -
public class HelloWorld { // class block
	int x=30;
	static int a=8; // global variable, has default value
	
	public static void main(String[] args) { // local block
		
		int z;
		int b=1; // no default value
		System.out.println(b);
		int c=10; // initialized with a value
		int d=10;
		boolean e=true;
		d=a; // USING b for reassignment
		System.out.println( a ); // USING b for printing
	}

}
