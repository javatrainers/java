
public class Reference {

	public static void main(String[] args) {
		Person p1=new Person(); // p1 object variable/reference variable
		p1.weight=12;
		Person p2=new Person(); // p1 object variable/reference variable
		p2=new Person();
		p1.weight=p2.weight;
		p1.weight=30;
		p1=new Person();
		p1=p2;
		p1.weight=p2.weight;
		
		System.out.println( p1.weight );
		System.out.println( p2.weight );
		
	}

}
