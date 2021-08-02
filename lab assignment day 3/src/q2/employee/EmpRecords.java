package q2.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpRecords {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> allEmp=new ArrayList<Employee>();
		
		int i=0;
		int choice=1;
		while(choice==1) {
			
			System.out.println("Enter 1 to hire an employee");
			System.out.println("Enter 2 to get weekly salary of an employee");
			System.out.println("Enter 3 to set the rate of an employee");
			System.out.println("Enter 4 to get payment");
			
			int input=sc.nextInt();
			Employee emp=null;
			if(input==1) {
				
				System.out.println("Enter 1 to hire a salaried employee");
				System.out.println("Enter 2 to hire a hourly employee");
				System.out.println("Enter 3 to hire a commission employee");
				
				System.out.println("Enter name of employee");
				String name=sc.nextLine();
				
				int empType=sc.nextInt();
				if(empType==1) {
					System.out.println("Enter weekly salary for salaried employee");
					double salary=sc.nextDouble();
					emp=new SalariedEmp(name,salary,i++);
					allEmp.add(emp);
				}else if(empType==2) {
					System.out.println("Enter hours worked for hourly employee");
					double hoursWorked=sc.nextDouble();
					System.out.println("Enter rate for hourly employee");
					double rate=sc.nextDouble();
					emp=new HourlyEmp(name,rate,hoursWorked,i++);
					allEmp.add(emp);
				}else if(empType==3) {
					System.out.println("Enter sales for commission employee");
					double sales=sc.nextDouble();
					System.out.println("Enter percentage for commission employee");
					double percent=sc.nextDouble();
					emp=new CommissionEmp(name,percent,sales,i++);
					allEmp.add(emp);
				}else {
					System.out.println("wrong input to hire and employee, please try again");
				}
			}else if(input==2) {
				System.out.println("Enter employee id to get weekly salary");
				int id=sc.nextInt();
				if(id>=allEmp.size())
					System.out.println("you entered wrong id, please try again");
				else {
					System.out.println("enter work or sales of that employee");
					System.out.println(allEmp.get(id).getWeeklySalary());
				}
			}else if(input==3) {
				System.out.println("Enter employee id to set salary/rate");
				int id=sc.nextInt();
				if(id>=allEmp.size())
					System.out.println("you entered wrong id, please try again");
				else {
					emp=allEmp.get(id);
					double setter;
					if(emp instanceof SalariedEmp) {
						System.out.println("Enter salary for Salaried employee");
						setter=sc.nextDouble();
						emp.setRate(setter);
					}else if(emp instanceof HourlyEmp) {
						System.out.println("Enter rate for Hourly employee");
						setter=sc.nextDouble();
						emp.setRate(setter);
					}else {
						System.out.println("Enter percentage of sales for Commission employee");
						setter=sc.nextDouble();
						emp.setRate(setter);
					}
				}
			}else if(input==4) {
				System.out.println("Enter employee id to set salary/rate");
				int id=sc.nextInt();
				if(id>=allEmp.size())
					System.out.println("you entered wrong id, please try again");
				else {
					emp=allEmp.get(id);
					emp.getPayment();
				}
			}else {
				System.out.println("you entered wrong input, please try again");
			}
			System.out.println();
			System.out.println("Enter 1 to continue, 0 to exit");
			choice=sc.nextInt();
			System.out.println();
		}
		sc.close();
	}

}
