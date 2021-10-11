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
		
		
		System.out.println("Enter student's name: ");
		System.out.println("Enter student's current year (fr, soph, jr, senior: ");
		System.out.println("Enter student's expected graduation year: ");
		
		s1.pName = scan.nextLine();
		s1.year = scan.nextLine();
		s1.gradYear = scan.nextInt();
		
		
		
		
		System.out.println(s1.pName);
		System.out.println(s1.year);
		System.out.println(s1.gradYear);
		
		
		
		
		
		scan.close();
	}

}
