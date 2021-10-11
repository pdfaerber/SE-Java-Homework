package oopConceptHW;

import java.util.Scanner;

public class Starter {
	

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
//		Employee e1 = new Employee();
		
		Scanner scan = new Scanner(System.in);
		
		//How do we read in hire date, start date, etc...?
//		System.out.println("Enter employee name: ");
//		e1.pName = scan.nextLine();
//		System.out.println(e1.pName);
		
		System.out.println("\n---------Student Mid-term Update--------------------------------\n");
		System.out.println("Enter student's name: ");
		System.out.println("Enter student's current year (fr, soph, jr, senior: ");
		System.out.println("Enter student's expected graduation year: ");
		System.out.println("Enter student's first exam score: ");
		System.out.println("Enter student's second exam score: ");
		System.out.println("Enter student's third exam score: ");
		
		s1.pName = scan.nextLine();
		s1.year = scan.nextLine();
		s1.gradYear = scan.nextInt();
		s1.scoreOne = scan.nextInt();
		s1.scoreTwo = scan.nextInt();
		s1.scoreThree = scan.nextInt();
		
		System.out.println("------------------------------------------------------\n");
		
		System.out.println("Student's name is: " + s1.pName);
		System.out.println("Student is enrolled as a: " + s1.year);
		System.out.println("Student's expected graduation year is: " + s1.gradYear);
		System.out.println("Exam One: " + s1.scoreOne);
		System.out.println("Exam Two: " + s1.scoreTwo);
		System.out.println("Exam Three: " + s1.scoreThree);
		System.out.println("Student's grade avg this far is: " + s1.gradeAvg(s1.scoreOne, s1.scoreTwo, s1.scoreThree));
		
		
		
		
		scan.close();
	}

}
