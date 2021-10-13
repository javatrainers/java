import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		StudentCol ss1=new StudentCol("john",1);
		StudentCol ss2=new StudentCol("jane",2);
		StudentCol ss3=new StudentCol("mike",1);
		StudentCol ss4=new StudentCol("john",1);
		StudentCol ss5=new StudentCol("andy",1);
		StudentCol ss6=new StudentCol("mike",1);
		
		HashMap<Integer, StudentCol> studs=new HashMap<Integer, StudentCol>();
		studs.put(1, ss1);
		studs.put(2, ss2);
		studs.put(3, ss3);
		studs.put(4, ss4);
		studs.put(4, ss5);
		
		System.out.println( studs.get(4));
		studs.remove(3);
		
		// Sorting.... Map read
		
		TreeSet<StudentCol> school=new TreeSet<StudentCol> ();
		
		school.add(ss1);
		school.add(ss2);
		school.add(ss3);
		school.add(ss4);
		school.add(ss5);
		school.add(ss6);
		
		System.out.println(school);
		System.out.println( "school size : "+school.size() );
		
		
		 String [] names=new String [5];
		 names[0]="john";
		 System.out.println(names[1]);
		 
		 
		 ArrayList<Student> nameCol=new ArrayList<Student> ();
		 Student s1=new Student();
		 Student s2=new Student();
		 nameCol.add(s1);
		 nameCol.add(s2);
		 
		 // allows duplicate, ordered, indexed
		 //ArrayList<String> namesColection=new ArrayList<String> ();
		 // LIST : arraylist, vector, linkd list
		 // arraylist : not synchronized.. FASTER , not thread safe
		 // vector : synchronized... SLOWER , Thread safe
		 // linked list : faster editing.. insert/delete middle
		 
		 // Set is unique - 
		 // hashset = unordered,linkedhasset- ordered,treeset-sorted
		 HashSet<String> namesColection=new HashSet<String> ();
		 namesColection.add("john");
		 namesColection.add("jane");
		 namesColection.add("mike");
		 namesColection.add("john");
		 System.out.println(namesColection);
		// System.out.println(namesColection.get(2));
		 
		 namesColection.remove("mike");
		 System.out.println(namesColection);
		// System.out.println(namesColection.get(2));
		 
		 
		 // namesColection.add(1,"andy");
		 System.out.println(namesColection);
		 // System.out.println(namesColection.get(2));
		 
		 // read collection list and set by foreach or iterator
		 // enhanced for loop, for-each
		 for(String s: namesColection) {
			 System.out.println(s);
		 }
		 
		 /*
		  	
		  		john
		  		jane
		  	>>>>mike
		  		
		  */
		 System.out.println("collection iterator reads");
		 Iterator<String> it=namesColection.iterator();
		 while(it.hasNext()) {
			 String s=it.next();
			 System.out.println(s);
		 }
	}

}
