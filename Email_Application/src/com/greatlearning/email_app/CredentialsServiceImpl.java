package com.greatlearning.email_app;

import java.util.Random;

public class CredentialsServiceImpl 
implements ICredentials {

	@Override
	public String generateEmailAddress(String fristName, String lastName, String department) {
		String emailAddress = fristName+lastName+"@"+department+".gl.com";
		return emailAddress;
	}

	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNPOQRSTUWXYZ";
		String smallLetters = "abcdefghijklmnpoqrstuwxyz";
		String specialCharacters = "!@#$%^&*()<>._+=";
		String numbers = "0123456789";

		String allValues = capitalLetters + smallLetters + specialCharacters + numbers;

		Random randomObj = new Random();
		String password = "";

		for (int i=0; i<8; i++) {

			/*int boundvalue = allValues.length();
			int randomIndex = randomObj.nextInt(boundvalue);
			char randomChar = allValues.charAt(randomIndex);
			password += String.valueOf(randomChar);**/
			
			String randomCharSet = capitalLetters + smallLetters + numbers + specialCharacters;
            password += randomCharSet.charAt(new Random().nextInt(randomCharSet.length()));
		}
		return password;
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear" +employee.getFristName() + "your generated credentails :");
		System.out.println("Email ID :" + employee.getEmail());
		System.out.println("Password :" + employee.getPassword());

	}

}
