package q5;

public class Vehicle {
	private int noOfWheel;
	private int noOfPassenger;
	private int model;
	private String make;
	
	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}
	
	public void display() {
		System.out.println("Make: "+this.make);
		System.out.println("Model: "+this.model);
		System.out.println("No of Wheels: "+this.noOfWheel);
		System.out.println("No of Passenger: "+this.noOfPassenger);
	}
	
}
