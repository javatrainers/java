
public class Methods {
	int balance=100;
	// DOES-A or action of program
	/* METHOD declaration
	 public OUTPUT		NAME	(INPUT) 

Output : CAN ALWAYS BE 0 or 1
	0 = void  ... 
		public  void hello(String message)
	1 = appropriate data type, int/boolean... 
		public int add(int a, int b)
	more than 1 = complex or multiple infor to return, create an object data type 
		public Profile display(String userid)
Input : CAN ALWAYS BE 0 or MORE
	0 = if no input require, leave it empty
		public int bye(  )
	More = if more than 1 input , separated by comma. 
		data type followed by the name 
		public int add(int number1, int number2)
*/
	int a1$_;
	/* METHOD BODY/DEFINITION rules
	if output is void - no return required
	if output is anything but void - return required
		primitive data type - 
			return literal value that matches output data type 
				or 
			return variable that matches output data type 
		Object data type
			return variable that matches output data type 
	*/	
	public int rectangeArea( int length,int width) {
		 return 10;
	}
	
	public String search(String searchkeyWord) {
		String result=" link1  link2 link3";
		return result;
	}
	
	public Person displayProfile( String userid) {
		// method body, method definition
		// logic, instructions, code for area of square
		int a=10;
		boolean b=true;
		String c="john";
		Person p1=new Person();
		Person p2=new Person();
		return p1;
	}	
	
	// method declaration
	public int areaOfSquare( int square_side ) {
		// method body, method definition
		// logic, instructions, code for area of square
		int a=10;
		boolean b=true;
		String c="john";
		return a;
	}	
}