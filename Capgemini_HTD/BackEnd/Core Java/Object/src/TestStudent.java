import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		Byid comp =new Byid();

		TreeSet<Student> ts =new TreeSet<Student>(comp);
		
		Student s1= new Student();
		s1.setId(1);
		s1.setName("Sneha");
		s1.setPercentage(86.91);
		s1.setGender('F');
		
		
		Student s2= new Student();
		s2.setId(2);
		s2.setName("Saumya");
		s2.setPercentage(91.80);
		s2.setGender('F');
		
		Student s3= new Student();
		s3.setId(3);
		s3.setName("Nisha");
		s3.setPercentage(77.83);
		s3.setGender('F');
		
		Student s4= new Student();
		s4.setId(4);
		s4.setName("Shubham");
		s4.setPercentage(60.45);
		s4.setGender('M');
		
		Student s5= new Student();
		s5.setId(5);
		s5.setName("Mohini");
		s5.setPercentage(80.90);
		s5.setGender('F');
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
	for (Student s : ts) {
		System.out.println("Student id is: "+s.getId());
		System.out.println("Student name is:  "+s.getName());
		System.out.println("Student percentage is: "+s.getPercentage());
		System.out.println("Student gender is: "+s.getGender());

		System.out.println("***********************************");
	}
		
	

		

	}

}
