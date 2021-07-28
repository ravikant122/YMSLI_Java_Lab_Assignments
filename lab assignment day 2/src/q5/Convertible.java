package q5;

public class Convertible extends Car{
	private boolean isHoodOpen;
	
	public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen=isHoodOpen;
	}
	
	public void display() {
		System.out.println("Convertible:");
		super.display();
		if(this.isHoodOpen)
			System.out.println("Hood is Open");
		else
			System.out.println("Hood is closed");
	}
}	
