/*************************************************************************************
 * Steps to follow:

1. Create a Person class that should have a parameterized constructor to make objects. 

2. Create 2 classes Employee and Student as subclasses of the Person  class as a super class.

3. To create objects for the  2 subclasses mentioned above, take input from the user (Do not put the hard coded  values in the variables).

4. Create another class as Person1 and declare private properties in it. Also create setter and getter methods in this class as public methods.

5. To test encapsulation create objects for this class with the user input values.

6. Create an Interface PersonInterface. Declare one static final variable for the organization
 name and create 2 abstract methods in it. One should be calculate which should take one int 
 argument and should return a double value. The other method should be of your choice.
 *********************************************************************************/

package oopConceptHW;

import java.util.Scanner;

public class Person {
	String pName;
	char pGender; 
	int pAge;
	
	public Person(String pName, char pGender, int pAge) {
		this.pName = pName;
		this.pGender = pGender;
		this.pAge = pAge;
	}
	
	public Person() {
		
	}
	public static void main(String[] args) {
		

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter employee name:");
//		Employee e1 = new Employee(); 
//		
//		e1.pName = scan.nextLine();
//		System.out.println(e1.pName);
		
		
		// TODO Auto-generated method stub

	}//end main
	

}//end class Person
