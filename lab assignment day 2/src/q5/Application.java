package q5;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vehicle v=null;
		
		System.out.println("Enter 1 to create a Vehicle Object");
		System.out.println("Enter 2 to create a Car Object");
		System.out.println("Enter 3 to create a Convertible Object");
		System.out.println("Enter 4 to create a SportCar Object");

		int userInput;		
		userInput=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Make, Model, noOfWheel, noOfPassenger(space separated)");
		String[] basicDetails=sc.nextLine().split(" ");
		String make=basicDetails[0];
		int model=Integer.parseInt(basicDetails[1]);
		int noOfWheel=Integer.parseInt(basicDetails[2]);
		int noOfPassenger=Integer.parseInt(basicDetails[3]);
		if(userInput==1) {
			v=new Vehicle(noOfWheel,noOfPassenger,model,make);
			v.display();
		}else if(userInput==2) {
			System.out.println("Enter Number of Doors");
			int noOfDoors=sc.nextInt();
			v=new Car(noOfWheel,noOfPassenger,model,make,noOfDoors);
			v.display();
		}else if(userInput==3) {
			System.out.println("Enter Number of Doors");
			int noOfDoors=sc.nextInt();
			System.out.println("is hood open?");
			boolean isHoodOpen=sc.nextBoolean();
			v=new Convertible(noOfWheel,noOfPassenger,model,make,noOfDoors,isHoodOpen);
			v.display();
		}else if(userInput==4) {
			v=new SportCar(noOfWheel,noOfPassenger,model,make);
			v.display();
		}else {
			System.out.println("Wrong Input... Exiting");
		}
		sc.close();
	}

}
