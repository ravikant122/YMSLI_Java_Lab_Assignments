package q2.employee;

public class HourlyEmp extends Employee {
	private double rate;
	private double hoursWorked;
	
	public HourlyEmp(String name,double rate,double hoursWorked,int empId){
		super(name,empId);
		this.rate=rate;
		this.hoursWorked=hoursWorked;
	}
	
	@Override
	public double getWeeklySalary() {
		return rate*hoursWorked;
	}

	@Override
	public void setRate(double rate) {
		this.rate=rate;
	}

	@Override
	public void increaseSalary(double rate) {
		this.rate+=rate;
		
	}
	
	@Override
	public double getPayment() {
		return rate*hoursWorked;
	}
}
