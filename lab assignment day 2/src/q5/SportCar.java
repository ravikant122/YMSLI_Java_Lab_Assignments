package q5;

public class SportCar extends Car{
	private int noOfDoors=2;
	
	public SportCar(int noOfWheel, int noOfPassenger, int model, String make) {
		super(noOfWheel, noOfPassenger, model, make, 2);
	}
	
	public void display() {
		super.display();
		System.out.println("Number of Doors: "+this.noOfDoors);
	}
}
