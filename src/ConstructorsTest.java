
public class ConstructorsTest {

	public static void main(String[] args) {
		Person p1=new Person("john");
		Person p2=new Person();
		Person p3=new Person("mike",10);
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		System.out.println(p1.weight);
		System.out.println(p2.weight);
		System.out.println(p3.weight);
	}

}
