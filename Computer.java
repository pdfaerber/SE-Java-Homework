/***********************************************************************************************
	Patrick D. Faerber, Per Scholas, Software Engineering Cohort 13, October 6, 2021
	Module 3: Week 2 - Homework 1, Getters & Setters 
	
	Getter & Setter Methods: 

	- Create a Computer class that has 3 variables. 
		The first variable will have a name. 	
		The second variable will be the year of the computer. 
		Last variable will be the cost of the computer.

	- All 3 variables should be private instance variables and must 
		use getters to retrieve the data and setters to set the variables.

*************************************************************************************************/

package getterSetterHW;

public class Computer {
	private	String Name;
	private long Year; 
	private double Cost; 

	
	private String getName() {
		return Name;
	}

	private void setName(String Name) {
		this.Name = Name;
	}

	private long getYear() {
		return Year;
	}

	private void setYear(long Year) {
		this.Year = Year;
	}

	private double getCost() {
		return Cost;
	}

	private void setCost(double Cost) {
		this.Cost = Cost;
	}

	public static void main(String[] args) {

		/**Fun with Object Getters and Setters**/
		Computer ComputerJobs = new Computer();
		ComputerJobs.setName("Wally");
		ComputerJobs.setYear(1985);
		ComputerJobs.setCost(21.21);
		
		System.out.println(ComputerJobs.getName());
		
		Computer ComputerGates = new Computer("Bill", 1984, 18.00);
		
		System.out.println(ComputerGates.getName());
		
		ComputerJobs.setName("Patrick");
		System.out.println(ComputerJobs.getName());
		ComputerGates.setName("Taj");
		System.out.println(ComputerGates.getName());
		System.out.println(ComputerGates.toString());
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Computer [Name=" + Name + ", Year=" + Year + ", Cost=" + Cost + "]";
	}

	//Parameterized Constructor
	public Computer(String name, long year, double cost) {
		Name = name;
		Year = year;
		Cost = cost;
	}
	//Empty Constructor
	public Computer() {
		// TODO Auto-generated constructor stub
	}



	
}
