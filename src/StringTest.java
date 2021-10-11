
public class StringTest {

	public static void main(String[] args) {
		int a=10;
		Person p=new Person();
		
		String s1="john"; // #abc pool
		String s2=new String("john"); // #pqr outside pool
		String s3="john"; // #abc pool
		
		// equal operators check address of the variable
		System.out.println( s1==s2 ); // false , s1=#abc, s2 =#pqr
		System.out.println( s1==s3 ); // true , s1=#abc, s3=#abc
		
		// equals methods checks value of variable
		System.out.println( s1.equals(s2) ); // true,  s1=john, s2 =john
		System.out.println( s1.equals(s3) ); // true,  s1=john, s3 =john
		
		String name="john";
		name=name.concat(" doe");
		System.out.println(name);
				
		String email="gmail.com";
		//-1
		System.out.println("email validation:"+
		( email.indexOf("@") > 0 && email.endsWith(".com")));
		
		String p1="John doe";
		String p2="john doe";
		System.out.println( p1.equalsIgnoreCase(p2)); // true
		System.out.println( p1.replaceFirst("o", "a"));
		String number="1234567890";
		System.out.println( number.replaceAll("-","").replaceAll(" ","").replaceAll("\\(","").replaceAll("\\)","") );
		String r1="john doe ny usa";
		String[] r1Arr=r1.split(" ");
		System.out.println(r1Arr[0]);
		System.out.println(r1Arr[1]);
		System.out.println(r1Arr[2]);
		System.out.println(r1Arr[3]);
		
		String p5="john doe";
		System.out.println(p5.substring(5));
		System.out.println(p5.substring(2,6));
		
		String p6="JOhn";
		System.out.println(p6.toUpperCase());
		System.out.println(p6.toLowerCase());
		
		String p7="  john doe   ";
		System.out.println(p7);
		System.out.println(p7.trim());
		
	}

}
