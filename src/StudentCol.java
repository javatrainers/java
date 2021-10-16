import java.io.Serializable;

public class StudentCol implements Comparable<StudentCol>,Serializable
{
	String name;
	int grade;
	
	public StudentCol(String n, int g) {
		name=n;
		grade=g;
	}
	// group/categorizing each student object
	public int hashCode() {
		return grade;
	}
	
	// compare items in group
	public boolean equals(Object o) {
		StudentCol anotherStudent=(StudentCol ) o;
		if( anotherStudent.name.equals(this.name) 
				&&
				anotherStudent.grade==this.grade
				)
			return true;
		else
			return false;
			
			
	}
	public String toString() {
		return name+":"+grade;
	}
	@Override
	public int compareTo(StudentCol o) {
		return this.name.compareTo(o.name);
	}
	
	
}
