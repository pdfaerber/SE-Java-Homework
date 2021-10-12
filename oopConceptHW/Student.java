package oopConceptHW;
import java.util.*;

public class Student extends Person implements PersonInterface{
	String major;
	String year;
	int gradYear; 
	int scoreOne;
	int scoreTwo;
	int scoreThree; 
	double gradeAvg; 
	
	public Student() {
		
	}
	
	

	public Student(String pName, char pGender, int pAge, String major, String year, int gradYear, int scoreOne, int scoreTwo, int scoreThree,
			double gradeAvg) {
		super(pName, pGender, pAge);
		this.major = major;
		this.year = year;
		this.gradYear = gradYear;
		this.scoreOne = scoreOne;
		this.scoreTwo = scoreTwo;
		this.scoreThree = scoreThree;
		this.gradeAvg = gradeAvg;
	}

double gradeAvg( int scoreOne, int scoreTwo, int scoreThree) {
	
	double avg = ((scoreOne + scoreTwo + scoreThree)/ 3);
	return avg;
}//end gradeAvg	 

//public double calculate(int this.gradeAvg()) {
//	 
//	return avg; 
//}


void input() {
	System.out.println("\n---------Student Mid-term Update--------------------------------\n");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter student's name: ");
	System.out.println("Enter student's current year (fr, soph, jr, senior: ");
	System.out.println("Enter student's expected graduation year: ");
	System.out.println("Enter student's first exam score: ");
	System.out.println("Enter student's second exam score: ");
	System.out.println("Enter student's third exam score: ");
	
	this.pName = scan.nextLine();
	this.year = scan.nextLine();
	this.gradYear = scan.nextInt();
	this.scoreOne = scan.nextInt();
	this.scoreTwo = scan.nextInt();
	this.scoreThree = scan.nextInt();
	
//	scan.close();
}

void display() {
	System.out.println("----------Student Summary--------------------------------\n");
	
	System.out.println("Student's name is: " + this.pName);
	System.out.println("Student is enrolled as a: " + this.year);
	System.out.println("Student's expected graduation year is: " + this.gradYear);
	System.out.println("Exam One: " + this.scoreOne);
	System.out.println("Exam Two: " + this.scoreTwo);
	System.out.println("Exam Three: " + this.scoreThree);
	System.out.println("Student's grade avg this far is: " + this.gradeAvg(this.scoreOne, this.scoreTwo, this.scoreThree));
}
	

}//end class Student
