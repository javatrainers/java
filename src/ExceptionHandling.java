
public class ExceptionHandling {
	public void method1() {
		System.out.println("method1");
		method2();
	}

	public void method2() {
		System.out.println("method2");
		method3();
	}

	public void method3() {
		System.out.println("method3");
		method4();
	}

	public void method4() {
		try {
		System.out.println("method4");
		int i=10;
		int j=0;
		int k=i/j; // infinity
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			throw ae;
		}
	}
}
