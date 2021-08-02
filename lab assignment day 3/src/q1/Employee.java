package q1;

public abstract class Employee {
	private String name;
	private int empId;

	public Employee(String name,int empId) {
		this.name=name;
		this.empId=empId;
	}

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}
	
	abstract double getWeeklySalary();
	abstract void setRate(double rate);
	abstract void increaseSalary(double rate);
	
}
