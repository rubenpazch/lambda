package FunctionalInterfaces.ExamsSol.GenericExamples;


public class Employee extends Person {
	int salary;
	public Employee(String n, int s) {
		super(n);
		this.salary = s;
	}
	public int getSalary() {
		return salary;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(getName());
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}
}

