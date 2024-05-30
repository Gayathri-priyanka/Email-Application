package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int defaultPasswordLength= 8;
	private int mailboxCapacity;
	private String alternateEmail;
	
	//constructor to receive the firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName= firstName;
		this.lastName=lastName;
		System.out.println("EMAIL CREATED: "+ this.firstName+ " "+ this.lastName); 
		//Call a method that returns department chose by user
		this.department=setDepartment();
		System.out.println("Department: " + this.department);
		
		
		//Call a method to set a random password
		this.password= randomPassword(defaultPasswordLength);
		System.out.println("Genrated Password: " + this.password);
		
	}
	
	
	//Ask for the department
	
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES: \n1 for sales\n2 for development\n3 for accounting\n0 for None\n Enter Department Code: ");
		Scanner input = new Scanner(System.in);
		int departmentChoice = input.nextInt();
		if(departmentChoice == 1) {return "sales";}
		else if(departmentChoice == 2) {return "development";}
		else if(departmentChoice == 3) {return "acounting";}
		else {return "";}
	}
	
	//Generate a random password
	
	private String randomPassword(int length) {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$&*";
		char[] password= new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	//set the mailbox capacity
	
	
	//set alternate Email
	
	
	//Change the password
	
}