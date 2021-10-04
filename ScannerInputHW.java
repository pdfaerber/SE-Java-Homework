/**************************************************************************
 * Patrick Faerber, PerScholas, Cohort 13, October 4, 2021
 * Module 3, Week 1, Homework 2 (User Input) 
 * 
 * User entered inputs (Scanner):
 * 1. Write Fibonnaci series between the user entered start and end values
 * 2. Determine whether a user entered number is an Armstrong number
 * 3. Write a program to see if a user entered string is a palindrome or not
 * 
 **************************************************************************
 *  Some common palindromes:
 *  1. never odd or even
 *  2. was it a rat i saw
 *  3. do geese see god
 *  4. a man a plan a canal panama
 *  5. amore roma
 *  6. borrow or rob 
 **************************************************************************/







package scannerInputHW;

import java.util.Scanner;


public class ScannerInputHW {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a number between 1 and 20:");
		int fibNum = scan.nextInt();
		fibonacci(fibNum);
		
		System.out.println("\n\nEnter a 3 digit number:");
		int armNum = scan.nextInt();
		armstrong(armNum);
		
		System.out.println("Enter a word or phrase to check for palindrome: ");
		String palStr = scan.nextLine();
		palindrome(palStr);
			
		
		scan.close();
		
	}
	/************ Problem 1: Fibonacci **************/
	public static void fibonacci(int fibNum) {
		int num1 = 0;
		int num2 = 1; 
		
		for(int i=0; i<= fibNum; i++) {
			System.out.print(num1 + ", ");
			int num3 = num1 + num2; 
			num1 = num2; 
			num2 = num3; 
			
		};
	}//end fibonacci; 

	
	/************ Problem 2: Armstrong **************/
		public static void armstrong(int armNum) {
			
			
			int remDigit= armNum;
			int sum = 0;
			while(remDigit != 0) {
				
				int digit = remDigit%10;
				System.out.println(digit);
				 remDigit = remDigit/10;
				 int product = digit*digit*digit; 
				 sum += product; 
				 
			}	 
				System.out.println(remDigit);
				System.out.println(sum);
				
			}//end armstrong
		
		
		/*******Problem 3: Palindrome **************/
		public static void palindrome(String palStr) {
			//initialize a String variable that holds the reverse
			//of the user input for comparison
			String revStr = "";
			
			//remove white space and (punctuation) for reverse comparison
			String compStr = palStr.replaceAll("\\s", "");
			compStr = compStr.toLowerCase();
			
			int strLen = compStr.length();
			System.out.println(strLen);
			
			
			for (int i = strLen-1; i >= 0; i-- ) {
				revStr = revStr + compStr.charAt(i);
				
			}
				System.out.println(compStr);
				System.out.println(revStr);
			if (compStr.equals(revStr)) {
				System.out.println(palStr + " is a palindrome");
			}else {
				System.out.println(palStr + " is not a palindrome");
			}
				
							
			}//end palindrome			
	}//end ScannerInputHW class


 
