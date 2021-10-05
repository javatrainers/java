
public class Hyundai {
	static String companyName="hyundai";
	int vin;
	String customerName;
	// relying on non-static class member
	public void method1() {
		System.out.println(vin);
		System.out.println(companyName);
		method2();
	}
	// relying on static class member
	public static void method2() {
		System.out.println(companyName);
		method3();
		System.out.println(vin);
		method1();
	}
	// does not rely on static or non-static class
	// member... Utility method
	public static void method3() {
		System.out.println("hello");
	}
	// static memeber can only call other static member
	// non static member can call everyone
	
	public Hyundai(String cn,int v) {
		customerName=cn;
		vin=v;
	}
	
}
