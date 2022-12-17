package practise;

public class Demo {

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.studentID=123;
		st1.studentName="Ankit";
		st1.studentAddress="Buxar";
		st1.studentMobile=9620588059L;
		
		// Student 1 Object
		
		st1.study();
		System.out.println("The details of student are : ");
		System.out.println();
		st1.showDetails();
		System.out.println();
		System.out.println("---------------------");
		
		// Student 2 object
		
		Student st2 = new Student();
		st2.studentID=124;
		st2.studentName="Saurabh";
		st2.studentAddress="Jaipur";
		st2.studentMobile=7737865411L;
		
		st2.study();
		System.out.println("The details of student are : ");
		System.out.println();
		st2.showDetails();
		
		Student st3 = new Student(125, "Vaibahv","Ghazipur",7348819891L);
		System.out.println();
		
		st3.showDetails();
		
		System.out.println();
		
		Student st4  = new Student(126);
		st4.study();
		
		st4.showDetails();

	}

}
