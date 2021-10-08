package oopConceptHW;

import java.util.Scanner;

public class Starter {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee name:");
		Employee e1 = new Employee(); 
		
		e1.pName = scan.nextLine();
		System.out.println(e1.pName);
		
	}

}
