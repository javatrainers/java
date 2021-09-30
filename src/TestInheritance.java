
public class TestInheritance {

	public static void main(String[] args) {
		ICar ic=new Nissan();
		ic.drive();
		ic.sing();
		if( ic instanceof Nissan)
			((Nissan)ic).start();
		if( ic instanceof NissanZ)
			((NissanZ)ic).autoDrive(); 
		//Child p=new Child();
		//p.test3();
	}

}
