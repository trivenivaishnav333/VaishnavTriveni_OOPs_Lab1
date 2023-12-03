package com.greatlearning.email_app;

public interface ICredentials {

	public String generateEmailAddress(String fristName, String lastName, String department);

	public String generatePassword();


	public void showCredentials(Employee employee);

}
