import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
	
	Person p=new Person();
	Person p1 ;//null
	
	public void method1() throws IOException  {
		//System.out.println( p.weight + p1.weight);
		System.out.println("method1");
		method2();
		
	}

	public void method2() throws IOException {
		System.out.println("method2");
		method3();
	}

	public void method3() throws IOException {
		System.out.println("method3");
		method4();
	}

	public void method4() throws IOException {
		System.out.println("method4");
		int i=10;
		int j=0;
		String [] names= {"john","jane"};
		File f=new File("x:/hi.txt");

		int k=i/j; // infinity arithemtic exception
		
		System.out.println(names[3]); // arrIndexOutOfBound
		
		f.createNewFile();
		// IOException. checked/compile time exception
		
	}
}
