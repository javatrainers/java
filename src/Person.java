// parent class, super class
public class Person {
	String name;// instance variale
	int weight;
	
	public void walk() {
		System.out.println("walking");
	}
	
	public Person(String n) {
		name=n;
	}
	public Person(String n,int w) {
		name=n;
		weight=w;
	}
	public Person() {
	
	}
}
