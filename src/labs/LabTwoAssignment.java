package labs;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class LabTwoAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("John Doe","52356212");
		s1.showCourses();
		s1.enroll();
		s1.pay(5000);
		s1.setCity("Cainta");
		s1.setPhone("528-850-0029");
		s1.setState("Rizal");
		System.out.println(s1.toString());
	}
}

class Student {
	// Get year for ID
	static Date date = new Date();
	static SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
	private static String iD = formatter.format(date).toString();
	
	// Variables
	private static final int initBalance = 30000;
	private int balance = initBalance;
	private String name;
	private String ssn;
	private String email;
	private String userID;
	private String phone;
	private String city;
	private String state;
	
	// Constructor
	public Student(String name, String ssn){
		Random random = new Random();
		int range = 1000 + random.nextInt(9000 - 1000 + 1);
		
		this.ssn = ssn;
		this.name = name;
		
		// Email based on name
		this.email = name.replace(" ",  ".").toLowerCase() + "@students.com";
		// User ID based on Static ID + random 4 digit between 1000 and 9000, and last 4 of SSN
		this.userID = iD + range + ssn.substring(0, 4);
		System.out.println("New Student Created: " + name);
		System.out.println("Student ID: " + userID);
	}
	
	// Getters and Setters	
	public String getEmail() {
		return email;
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
	
	// Methods
	public void enroll() {
		System.out.println("\n[Student Name: " + name + "]\n[Student ID: " + userID + "]\n[Status: Enrolled]");
	}
	
	public void pay(int amount) {
		balance -= amount;
		System.out.println("\nTuition fee with the amount of " + amount + " paid for student " + name + ". Thank you.");
		checkBalance();
	}
	
	private void checkBalance() {
		System.out.println("\nTuition Balance for " + name + " is " + balance);
	}
	
	public void showCourses() {
		System.out.println("\nShowing available courses for student " + name);
		System.out.println("Computer Science");
		System.out.println("Psychology");
	}
	
	@Override
	public String toString() {
		return "\n[Student Details]\nStudent Name: " + name + "\nSSN: " + ssn + "\nStudent ID: " + userID + "\nEmail: " + email + "\nPhone: " + phone + "\nCity: " + city + "\nState: " + state;
	}
}