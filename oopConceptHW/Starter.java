package oopConceptHW;

import java.util.*;

public class Starter {
	

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
//		Employee e1 = new Employee();
		Person1 p1 = new Person1();
		//Scanner scan = new Scanner(System.in);
		
		//How do we read in hire date, start date, etc...?
//		System.out.println("Enter employee name: ");
//		e1.pName = scan.nextLine();
//		System.out.println(e1.pName);
		
		/*Student input and summary display*/
		s1.input();
		s1.display();
		
		/*class Person 1 input and Summary Display*/
		p1.input();
		p1.display();
		
//		scan.close();
	}

}
