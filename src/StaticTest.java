
public class StaticTest {

	public static void main(String[] args) {
		System.out.println(Hyundai.companyName);
		Hyundai h1=new Hyundai("john", 1234);
		System.out.println(h1.customerName);
		
		Calculator.add(10, 20);
	}

}
