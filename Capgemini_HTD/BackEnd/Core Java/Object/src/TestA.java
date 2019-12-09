
public class TestA {
public static void main(String[] args) {
	Student s= new Student();
	
	s.setId(20);
	s.setName("Sneha");
	s.setHeight(6.3);
	
	Database d = new Database();
	d.receive(s);
}
}
