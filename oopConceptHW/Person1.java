package oopConceptHW;

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
	
	void display() {
		
		
		
		
	}
	
	

}//end class Person1 
