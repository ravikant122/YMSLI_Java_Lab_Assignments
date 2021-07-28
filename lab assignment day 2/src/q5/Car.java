package q5;

public class Car extends Vehicle{
	private int noOfDoor;

	public Car(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
	}
	
	public void display() {
		System.out.println("Car:");
		super.display();
		System.out.println("No of Doors: "+this.noOfDoor);
	}
}
