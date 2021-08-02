package q3;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	private Address address;
	private double salary;
	public Employee(String name, String id, Address address, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Name= "+name+", id= "+id+", salary= "+salary);
		address.display();
	}

}
