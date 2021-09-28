
public class Parent extends GrandParent{
	int x=300;
	public int b=20;
	public void test2() {
		System.out.println("test2");
	}
	public Parent() {
		super("john");
		System.out.println("Parent is born");
	}
}
