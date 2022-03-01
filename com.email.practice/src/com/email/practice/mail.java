package com.email.practice;

import java.util.*;
import java.util.regex.*;

public class mail {
	 
	public static void main(String[] args) {

	List<String> emails = new ArrayList<String>();
	

	for (String value : emails) {
	System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));

	}
	System.out.println("Enter the email address to check"); 
	Scanner s1 = new Scanner(System.in);
	String input = s1.nextLine();
	System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));


	}

	public static boolean isValidEmail(String email) { 
		String regex = "^(.+)@(.+)$";

	Pattern p1 = Pattern.compile(regex);
	Matcher m2 = p1.matcher(email); 
	return m2.matches();


	}

	}
