/*************************************************************************************
	
	Patrick D. Faerber, Per Scholas Software Engineering Cohort 13, October 5, 2021
	
	Module 3: Week 1, Homework 3
	
 *************************************************************************************	
	Build a calculator:

	Write a program to create a calculator that can Add, Subtract, Multiply, 
	and Divide 2 numbers entered by the user. Also, add an option to exit out from the program.
  	OPTIONS

	1. Add

	2. Subtract

	3. Multiply

	4. Divide

	5. Exit

	1. Write different methods for each module (add, subtract, multiply, and divide).

	2. Use switch/case to call the particular method.

	3. Take input inside the methods to perform the related operation.

	4. Return the answer and display it inside the main method.

	5. Display a default message (ex. "Invalid Entry, Try Again") 
   	if any number other than 1-5 is entered by the user
*******************************************************************************************/


package calculatorHW;

import java.util.Scanner;

public class CalculatorHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Calculation Menu Number: \n1. Addition \n2. Subtraction \n3. Multiply \n4. Division \n5. Exit");
		int menu = scan.nextInt();
//		System.out.println(menu);
		
		System.out.println("Enter 2 Integers for Calculation: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		
		calculate(menu, num1, num2);
		
		
	}//main
	
public static void calculate(int menu, int num1, int num2) {
	System.out.println("menu: " + menu);
	System.out.println(num1);
	System.out.println(num2);
	
//	boolean test = false;	
	String userMsg; 
//	while(test) {
		switch (menu) {
		case 1:
			System.out.println("The sum of your two numbers is: " + addition(num1, num2));
			break;
		case 2:
			
			System.out.println("The difference of your two numbers is: " + subtraction(num1, num2));
			break;
			
		case 3:
			System.out.println("The product of your two numbers is: " + multiply(num1, num2));
			break;
		
		case 4:
			System.out.println("The quotient of your two numbers is: " + divide(num1, num2));
			break;
		
		case 5:
			userMsg = "Are you sure you want to exit the program? ";
			return;
		
		default:
			userMsg = "Invalid Input";
			break;
		
		}//end switch
//		System.out.println(userMsg);
//	}//end while(test)
	 
	
}
	public static int addition(int num1, int num2) {

		int sum = num1 + num2;
		return sum;
		
	}//addition
	
	public static int subtraction(int num1, int num2) {

		int diff = num1 - num2;
		return diff;
		
	}//endsubtraction
	
	public static int multiply(int num1, int num2) {

		int prod = num1 * num2;
		return prod;
		
	}//end multiply
	
	public static int divide(int num1, int num2) {

		int quotient = num1 / num2;
		return quotient;
		
	}//end multiply


}//end CalculatorHW 
