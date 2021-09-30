// incomplete/abstract class
public abstract interface ICar {
	int a=10; // constant bcos method have no body or logic
	public abstract void drive();
	default void sing() {
		System.out.println("modern");
	}
}
