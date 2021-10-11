package oopConceptHW;

import java.util.Scanner;

public class Starter {
	

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		Employee e1 = new Employee();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		e1.pName = scan.nextLine();
		System.out.println(e1.pName);
		
		
		System.out.println("Enter student's name: ");
		s1.pName = scan.nextLine();
		
		System.out.println("Enter student's year: ");
		s1.pName = scan.nextLine();
		
		System.out.println(s1.pName);
		
		
		
		
		
		scan.close();
	}

}
