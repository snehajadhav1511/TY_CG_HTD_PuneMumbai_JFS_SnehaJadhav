

public class Database {
	
	void receive(Student t) {
		System.out.println("******I am Database*******");
		System.out.println("Student id is: "+t.getId());
		System.out.println("Student name is: "+t.getName());
		System.out.println("Student height is: "+t.getHeight());
	}
	void receive(Employee e) {
		System.out.println("******I am Database*******");
		System.out.println("Employee id is: "+e.getId());
		System.out.println("Employee name is: "+e.getName());
		System.out.println("Employee salary is: "+e.getSalary());
		System.out.println("Employee role is: "+e.getRoll());
		System.out.println("Employee dept is: "+e.getDept());
		
	}
}
