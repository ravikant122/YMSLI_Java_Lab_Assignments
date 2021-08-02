package q2.employee;

import q2.payable;

public abstract class Employee implements payable{
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
