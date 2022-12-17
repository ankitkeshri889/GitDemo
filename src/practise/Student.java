package practise;

public class Student {

	// data members , class variables , instance variables
	int studentID;
	String studentName;
	String studentAddress;
	long studentMobile;

	public Student() {
		System.out.println("This is a default constructor ...");
	}

	public Student(int studentID, String studentName, String studentAddress, long studentMobile) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentMobile = studentMobile;
	}

	// Behaviour , methods , functions

	public Student(int studentID) {
		this.studentID = studentID;
		System.out.println("This is a parametrised constructor of one args : " + studentID);
	}
	
	// Method Overloading

	public void study() {
		System.out.println(studentName + " is studying");
	}

	public void study(float f) {

	}

	public void study(int f) {

	}
	
	public void study(int f , int g) {

	}
	
	public int study(int f , int g , int h) {
		return f+g+h;
	}

	public void showDetails() {
		System.out.println("ID : " + studentID);
		System.out.println("Name : " + studentName);
		System.out.println("Address : " + studentAddress);
		System.out.println("Mobile : " + studentMobile);
	}

}
