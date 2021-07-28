package q4;

public class Student {
	
	private String name=null;
	private String id=null;
	private String grade=null;
	
	public Student(String name,String id,String grade) {
		this(name,id);
		this.grade=grade;
	}
	
	public Student(String name,String id) {
		this(id);
		this.name=name;
	}
	
	public Student(String id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("id: "+this.id);
		System.out.println("grade: "+this.grade);
	}
	
	public void display(int year) {
		display();
		System.out.println("Year: "+year);
	}
}
