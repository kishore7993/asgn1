package com.gl.driver;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class DriverClass {
	public static void main(String[] args) {
	Scanner scan1 = new Scanner(System.in);
	System.out.println("1. Technical Department");
	System.out.println("2.Admin Department");
	System.out.println("3.human Resource Department");
	System.out.println("4.Legal department");
	Employee employee1 = new Employee("kishore","vangapandu");
	CredentialService cService = new CredentialService();
	int choice;
	System.out.println("enter option  no bw 1-4");
	choice = scan1.nextInt();
	{
		String generatedEmail;
		char[] generatedPsswd;
		if(choice == 1)
		{
			generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"Tech");
			generatedPsswd = cService.generatePassword();
			cService.displayCredentials(employee1, generatedEmail, generatedPsswd);
			
		}
		else if(choice == 2) {
			generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"Admin");
			generatedPsswd = cService.generatePassword();
			cService.displayCredentials(employee1, generatedEmail, generatedPsswd);
			
			
		}
		else if(choice == 3) {
			generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"hr");
			generatedPsswd = cService.generatePassword();
			cService.displayCredentials(employee1, generatedEmail, generatedPsswd);
			
		}
		else if(choice == 4) {
			generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"legal");
			generatedPsswd = cService.generatePassword();
			cService.displayCredentials(employee1, generatedEmail, generatedPsswd);
			
		}
		else {
			System.out.println("range is 1-4");
		}
	}
	

	}

}
