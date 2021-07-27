package q3;

public class GradesAverage {
	private int numberOfStudents;
	private int[] grades;
	private int sum=0;
	private int counter=0;
	
	GradesAverage(int numberOfStudents){
		this.numberOfStudents=numberOfStudents;
		this.grades=new int[this.numberOfStudents];
	}

	public int getNumberOfStudents() {
		return this.numberOfStudents;
	}

	public int[] getGrades() {
		if(!check()) {
			return null;
		}
		return grades;
	}

	public float getAverage() {
		if(!check())
			return 0;
		return (float)sum/this.numberOfStudents;
	}
	
	public boolean putGrade(int newGrade) {
		if(this.counter>=this.numberOfStudents) {
			System.out.println("can't accept new grades because all students have their grades now");
			return false;
		}
		if(newGrade<0 || newGrade>100) {
			System.out.println("given grade is too low or too high");
			return false;			
		}
		this.grades[counter++]=newGrade;
		this.sum+=newGrade;
		return true;
	}
	
	private boolean check() {
		if(this.counter!=this.numberOfStudents) {
			System.out.println("you didn't enter grades for all student, yet.");
			return false;
		}
		return true;
	}
	
	
}
