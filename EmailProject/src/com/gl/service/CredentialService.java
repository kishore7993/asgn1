package com.gl.service;

import java.util.Random;

import com.gl.model.Employee;

public class CredentialService {
	public char[] generatePassword()
	{
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLeters = "abcdefghijklmnopqrstuvwxyz";
		String numbers= "0123456789";
		String specialCharacters = "!@#$%^&*?,.=_<>";
		String myData = capitalLetters+smallLeters+numbers+specialCharacters;
		char[] passWord = new char[8];
		Random random = new Random();
		for(int i=0; i<8;i++)
		{
		 passWord[i]=myData.charAt(random.nextInt(myData.length()));
		}
		return passWord;
				
	}
		
	public String generateEmail(String firstName, String lastName, String department)
	{
		String generateEmail;
		generateEmail = firstName+lastName+"."+department+"@abc.com";
		return generateEmail;
		
	}
	public void displayCredentials(Employee employee,String eMailGen, char[] genPsswd)
	{
		System.out.println("hi"+employee.getFirstName());
		System.out.println("your email is"+eMailGen);
		System.out.println("your password is"+genPsswd);
	}
}
	
	
	
	
