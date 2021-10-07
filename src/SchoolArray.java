
public class SchoolArray {
	public int a;
	
	public static void main(String[] args) {
		// array declaration
		// size of student variables
		// declares student variables
		Student[] allStudents=new Student[5];
		for(int i=0;i<5;i++)
			System.out.println(allStudents[i]);
		
		for(int i=0;i<5;i++)
			allStudents[i]=new Student();
		
		for(Student s:allStudents)
			s=new Student();
		
		for(int i=0;i<5;i++)
			System.out.println(allStudents[i]);
		
		Student[][] school=new Student[3][2];			
		System.out.println(school[1][1]);
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				school[i][j]=new Student();
			}
		}
		System.out.println(school[1][1]);
		
		
		// array declaration + initlization
		int[] scoreA= {12,56,78,99,125};
		// array declaration
		int[] scoreB=new int[5];
		
		//enhanced for loop. for each
		for(int i:scoreB)
			System.out.println(i);
		
		System.arraycopy(scoreA, 1, scoreB, 2, 3);
		System.out.println("*****");
		for(int i:scoreB)
			System.out.println(i);
		
	}

}
