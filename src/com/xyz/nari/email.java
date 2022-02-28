package com.xyz.nari;
import java.util.*;
import java.util.regex.*;

public class email {
	public static void main(String[] args) {

	List<String> emails = new ArrayList<String>();
	
	for (String value : emails) {
	System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));

	}
	System.out.println("Enter any email address to check");
	Scanner mail = new Scanner(System.in);
	String input = mail.nextLine();
	System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));


	}

	public static boolean isValidEmail(String email) {
		String regex = "^(.+)@(.+)$";

	Pattern p1 = Pattern.compile(regex);
	Matcher m1 = p1.matcher(email); 
	return m1.matches();


	}
	}

