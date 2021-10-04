import java.util.Scanner;

public class TestInterface {

	public static void main(String[] args) {
		
		NissanZ n=new NissanZ();
		n.takeTurn(10);
		n.takeTurn("asd");
		n.takeTurn(10.0f);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for nissan , 2 for luxury nissan");
		int option=sc.nextInt();
		if(option==1) {
			ICar car1=new Nissan();
			rentCar(car1);
		}
		else if(option==2) {
			NissanZ car2=new NissanZ();
			// RHS should be child of LHS
			// RHS should be complete class
			rentCar(car2);
		}
		else if(option==3) {
			ICar car3=new Toyota();
			// RHS should be child of LHS
			// RHS should be complete class
			rentCar(car3);
		}	
	}
	// runtime polymorphism
	// many forms 
	// many ways to drive
	// hardcoding - Nisaan, future nissan car
	public static void rentCar(ICar ic) {
		ic.drive();
	}

}
