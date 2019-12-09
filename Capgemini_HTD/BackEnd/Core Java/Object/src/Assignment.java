
public class Assignment {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(20);
		e.setName("Sneha");
		e.setRoll("Software Developer");
		e.setDept("Development");
		e.setSalary(40000.567);
		
		Database d1 = new Database();
		d1.receive(e);
	}
}
