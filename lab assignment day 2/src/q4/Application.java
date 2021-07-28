package q4;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Student> allStudents=new ArrayList<Student>();
		System.out.println("------ Welcome to Student Portal -------");
		System.out.println();
		
		String wantToContinue="Y";
		while(wantToContinue.equals("Y") || wantToContinue.equals("y")) {
			System.out.println("Enter 1 to create object");
			System.out.println("Enter 2 to display student info");
			int userInput=sc.nextInt();
			sc.nextLine();
			
			if(userInput==1) {
				System.out.println("Enter student details(space seprated i.e. id name grade)");
				String studentDetailsOneLine=sc.nextLine();
				String[] studentDetails=studentDetailsOneLine.split(" ");
				if(studentDetails.length==1) {
					allStudents.add(new Student(studentDetails[0]));
				}else if(studentDetails.length==2) {
					allStudents.add(new Student(studentDetails[0],studentDetails[1]));
				}else if(studentDetails.length==3) {
					allStudents.add(new Student(studentDetails[0],studentDetails[1],studentDetails[2]));
				}else {
					System.out.println("you entered more than 3 parameters, please try again");
				}
			}else if(userInput==2) {
				if(allStudents.size()==0) {
					System.out.println("Student List is Empty");
				}else {
					System.out.println("Enter year:");
					int year=sc.nextInt();
					for(Student s:allStudents) {
						s.display(year);
					}
				}
			}else {
				System.out.println("Wrong input");
			}
			
			System.out.println("Enter Y or y to continue, else N or n");
			wantToContinue=sc.next();
		}
		System.out.println("------ Bye For now, see you soon ------");
		
		sc.close();
		
	}

}
