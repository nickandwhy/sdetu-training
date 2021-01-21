package oop;

public class StudentDatabase {

	public static void main(String[] arg) {
		//create student
		Student student1 = new Student("Janelle", "321456987");
		Student student2 = new Student("Thomas", "456879546");
		Student student3 = new Student("Elizabeth", "615326574");
		
		student1.enroll("math151");
		student1.enroll("eng255");
		student1.enroll("history211");
		
		//student1.showCourses();
		//student1.checkBalance();
		student1.payTuition(600);
		//student1.checkBalance();
		System.out.println(student1.toString());
	}
}

class Student {
	// create proberties
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private static int iD = 0;
	private String userID;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@sdetuniversity.com";
		System.out.println("your email: " + email);
	}
	private String getEmail() {
		return email;
	}
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randNum = (int)(Math.random() * (max - min));
		randNum = randNum + min;
		userID = iD + "" + randNum + ssn.substring(5);
		System.out.println("your user ID: " + userID);
	}
	public void enroll(String course) {
		this.courses = this.courses + ", " + course;
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: " + amount);
		balance = balance - amount;
	}
	
	public void checkBalance() {
		System.out.println("balance: €" + balance);
	}
	
	public String toString() {
		return "[NAME: " + name + "]\n[COURSES: " + courses + "]\nBALANCE: " + balance + " ]";
	}
	
	public void showCourses() {
		System.out.println(courses);
	}	
}