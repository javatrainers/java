import java.util.Scanner;

public class ControlFlow {
	public static void main(String[] args) {
		int balance=100;
		int withdrawAmount=20;
		boolean c=true;
		// false, c, a==b
		  if( balance >= withdrawAmount ){
			  System.out.println("success transaction");
		  }
		  else { // default block
			  System.out.println("failed transaction");
		  }
		  int a=20;
		  int b=20;
		  int d=20;
		  if(a==b) { // true
			  System.out.println("a and b are same");
		  }
		  else if ( b==d ) { 
			  System.out.println("b and d are same");
		  }
		  else if ( a == d) {
			  System.out.println("a and d are same");
		  }else {
			  System.out.println("all different");
		  }
		  System.out.println("program exit");
		 
		  
		  for ( int i=1 ; i < 4; i++){
			  System.out.println("hi");
				if(i==2){
					break; // skip next lines in current loop. continue with next loop
				}
				System.out.println("bye");
			}
		  
		  System.out.println("****** while ****");
		  Scanner sc=new Scanner(System.in); 
		  System.out.println("add items to cart.. enter true/false");
		  boolean add=sc.nextBoolean();
		  while(add) {
			  System.out.println("item added to cart");
			  System.out.println("add another items to cart.. enter true/false");
			  add=sc.nextBoolean();
		  }
		  System.out.println("**** do while ***");
		  
		  boolean atm=true;
		  do{
			  System.out.println("processed atm tran");
			  System.out.println("do u wish to continue with another transaction.. enter true/false");
			  atm=sc.nextBoolean();
		  }while(atm) ;
		  
		  
		  int x=5;
		  while( x > 0 ) {
			//  if(x==2)
			//	  continue ;
			  System.out.println("hi");
			  x--;
		  }// while true , if false, hi, x=4
		  // while true, if false, hi, x=3
		  // while true, if false, hi , x=2
		  // while true, if true,
		  // while true, if true,
		  // while true, if true,
		   
		  int s=2;
		  switch(s) {
			  case 1:
				  System.out.println("s is 1");
				  break;
			  case 2:
				  System.out.println("s is 2");
				  break;
			  case 3:
				  System.out.println("s is 3");
				  break;
			  default:
				  System.out.println("s is unknown");
				  break;
		  }
		  
		  
	}
	public int test() {
		int a=10;
		int b=20;
		if(a==b) 
			return 1234;
		else
			return 567;
		// {} multiple line grouped together
	}
	
	
}
