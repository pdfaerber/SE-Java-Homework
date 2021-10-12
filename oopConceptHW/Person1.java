package oopConceptHW;
import java.util.*;

public class Person1 extends Person {
	private String birthplace; 
	private String highschool;
	private String college;
	
	
	public Person1(String pName, char pGender, int pAge, String birthplace, String highschool, String college) {
		super(pName, pGender, pAge);
		
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public String getHighschool() {
		return highschool;
	}
	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public Person1() {
		
	}
	
	void input() {
		System.out.println("\n---------Person1 Input--------------------------------\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Person1's name: ");
		System.out.println("Enter Person1's place of birth: ");
		System.out.println("Enter Person1's Highschool: ");
		System.out.println("Enter Person1's college attended: ");
		
		this.pName = scan.nextLine();
		this.setBirthplace(scan.nextLine());
		this.setHighschool(scan.nextLine());
		this.setCollege(scan.nextLine());
		
		scan.close();
	}
	
	
	void display() {
		System.out.println("\n---------Person1 Input Summary--------------------------------\n");
		System.out.println("Person1's name is: " + this.pName);
		System.out.println("Person1's place of birth is: " + this.getBirthplace());
		System.out.println("Person1's Highschool is: " + this.getHighschool());
		System.out.println("Person1's college attended is: " + this.getCollege());
		
	}
	
	

}//end class Person1 
