import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
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
		 LinkedList<String> namesColection=new LinkedList<String> ();
		 namesColection.add("john");
		 namesColection.add("jane");
		 namesColection.add("mike");
		 namesColection.add("john");
		 System.out.println(namesColection);
		 System.out.println(namesColection.get(2));
		 
		 namesColection.remove("mike");
		 System.out.println(namesColection);
		 System.out.println(namesColection.get(2));
		 
		 
		 namesColection.add(1,"andy");
		 System.out.println(namesColection);
		 System.out.println(namesColection.get(2));
		 
	}

}
