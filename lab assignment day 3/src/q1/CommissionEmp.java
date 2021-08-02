package q1;

public class CommissionEmp extends Employee {
	private double percent;
	private double sales;
	
	public CommissionEmp(String name,double percent,double sales,int empId) {
		super(name,empId);
		this.percent = percent;
		this.sales=sales;
	}

	@Override
	public double getWeeklySalary() {
		return sales*percent*0.01;
	}

	@Override
	public void setRate(double percent) {
		this.percent=percent;
	}

	@Override
	public void increaseSalary(double percent) {
		this.percent+=percent;
	}
	
}
