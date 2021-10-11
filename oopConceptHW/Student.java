package oopConceptHW;
import java.util.*;

public class Student extends Person {
	String major;
	String year;
	int gradYear; 
	int scoreOne;
	int scoreTwo;
	int scoreThree; 
	double gpa; 
	
	public Student() {
		
	}
	
	

	public Student(String pName, char pGender, int pAge, String major, String year, int gradYear, int scoreOne, int scoreTwo, int scoreThree,
			double gpa) {
		super(pName, pGender, pAge);
		this.major = major;
		this.year = year;
		this.gradYear = gradYear;
		this.scoreOne = scoreOne;
		this.scoreTwo = scoreTwo;
		this.scoreThree = scoreThree;
		this.gpa = gpa;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
