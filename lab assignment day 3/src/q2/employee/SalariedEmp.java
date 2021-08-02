package q2.employee;

public class SalariedEmp extends Employee{
	private double salary;
	
	public SalariedEmp(String name,double salary,int empId) {
		super(name,empId);
		this.salary=salary;
	}
	
	@Override
	public double getWeeklySalary() {
		return salary;
	}

	@Override
	public void setRate(double salary) {
		if(salary>=0.0)
			this.salary=salary;
		else
			System.out.println("salary must be greater than 0");
	}

	@Override
	public void increaseSalary(double rate) {
		this.salary+=salary;
	}

	@Override
	public double getPayment() {
		return salary;
	}
}
