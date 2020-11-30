package labs;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class LabTwoAssignmentVersion2 {

	public static void main (String[] args) {
		StudentVersionTwo student1 = new StudentVersionTwo("Jane Doe", "41263463");
		student1.enroll("MATH101");
		student1.enroll("ENG101");
		student1.checkBalance();
		student1.showCourses();
		student1.payTuition(2000);
		student1.checkBalance();
		System.out.println(student1.toString());
		
		StudentVersionTwo student2 = new StudentVersionTwo("John Smith", "51336471");
		student2.enroll("MATH101");
		student2.enroll("ENG101");
		student2.checkBalance();
		student2.showCourses();
		student2.payTuition(1000);
		student2.checkBalance();
		student2.setState("New York");
		System.out.println(student2.toString());
		
		StudentVersionTwo student3 = new StudentVersionTwo("Michael Phoenix", "55636224");
		student3.enroll("MATH101");
		student3.enroll("ENG101");
		student3.enroll("HIS101");
		student3.checkBalance();
		student3.showCourses();
		student3.payTuition(2500);
		student3.checkBalance();
		student3.setState("New York");
		student3.setCity("New York");
		System.out.println(student3.toString());
		
		StudentVersionTwo student4 = new StudentVersionTwo("Michael Phoenix", "55636224");
		student4.enroll("MATH101");
		student4.enroll("ENG101");
		student4.enroll("HIS101");
		student4.checkBalance();
		student4.showCourses();
		student4.checkBalance();
		student4.setPhone("513-412-2634");
		student4.setState("New York");
		student4.setCity("New York");
		System.out.println(student4.toString());
	}
}

class StudentVersionTwo {
	// Get year for ID
	static Date date = new Date();
	static SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
	private static String iD = formatter.format(date).toString();
	
	private String name;
	private String ssn;
	private String email;
	private String userID;
	private String phone = "";
	private String city = "";
	private String state = "";
	private String courses = "";
	private int balance = 0;
	private static final int courseCost = 1000;
	
	public StudentVersionTwo(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		
		System.out.println("New Student Record Created:");
		// Create Email
		createEmail();
		// Create User ID
		createUserID();
		System.out.println("\n");
	}
	
	// Getters/Setters
	
	
	public void createEmail() {
		// Create email using name. Replace spaces with dot (.)
		email = name.replace(" ", ".").toLowerCase() + "@university.com";
		System.out.println("Email: " + email);
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

	public void createUserID() {
		// Create Random number between 1000 and 9000
		Random rand = new Random();
		int rangeNum = 1000 + rand.nextInt(9000 - 1000 + 1);
		
		// Concatenate static ID, random 4 digit number and last 4 digits of ssn
		userID = iD + rangeNum + ssn.substring(ssn.length()-4);
		System.out.println("User ID: " + userID);
	}
	
	public void enroll(String course) {
		// Enroll course for student
		this.courses += (course + "\n");
		this.balance += courseCost;
		System.out.println("Course " + course + " enrolled for student " + name + " (" + userID + ")") ;
	}
	
	public void payTuition(int amount) {
		// Pay tuition fee for student
		this.balance -= amount;
		System.out.println("Paid: $" + amount + "\n");
	}
	
	public void checkBalance() {
		// Show balance for student
		if (balance <= 0) {
			System.out.println("Tuition fee balance for " + name + "(" + userID + ") is fully paid.\n");
		}
		else {
			System.out.println("Tuition fee balance for " + name + "(" + userID + ") is $" + balance + "\n");
		}
	}
	
	public void showCourses() {
		// Display courses enrolled by student
		if (courses == "") {
			System.out.println("Student " + name + "(" + userID + ") does not have any courses enrolled\n");
		}
		else {
			System.out.println("Showing courses enrolled by " + name + "(" + userID + "): \n---------------------\n" + courses + "\n");
		}
	}
	
	@Override
	public String toString() {
		String returnStr = "STUDENT DETAILS \n---------------------\nName: " + name + "\nUser ID: " + userID + "\nSSN: " + ssn + "\nEmail: " + email + "\n";
		if (phone != "") {
			returnStr += "Phone : " + phone + "\n";
		}
		if (state != "") {
			returnStr += "State : " + state + "\n";
		}
		if (city != "") {
			returnStr += "City : " + city + "\n";
		}
		return returnStr;
	}
}
