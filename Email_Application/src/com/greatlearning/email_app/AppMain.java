package com.greatlearning.email_app;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {

		Employee demoEmployee = new Employee("Triveni","Vaishnav");

		ICredentials credentialsService = new CredentialsServiceImpl();

		System.out.println("Please choose the department from the below options :");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");

		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();

		String generatedEmail = null;
		String generatedPassword = null;

		switch(option) {
		case 1:{
			generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFristName() ,demoEmployee.getLastName() , "Technical");
			generatedPassword = credentialsService.generatePassword();
			break;
		}
		case 2:{
			generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFristName(),demoEmployee.getLastName(), "Admin");
			generatedPassword = credentialsService.generatePassword();
			break;
		}
		case 3:{
			generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFristName(), demoEmployee.getLastName(), "Human Resources");
			generatedPassword = credentialsService.generatePassword();
			break;
		}
		case 4:{
			generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFristName(), demoEmployee.getLastName(), "Legal");
			generatedPassword = credentialsService.generatePassword();
			break;
		}

		default:{
			System.out.println("Enter the vaild department option");
			break;
		}			


		}

		demoEmployee.setEmail(generatedEmail);
		demoEmployee.setPassword(generatedPassword);
		credentialsService.showCredentials(demoEmployee);
	}

}
