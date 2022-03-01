package com.regularexp.assisted;

import java.util.regex.*;

public class regularexp {
	


	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "narendra bhadineni";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(check);
		
		while (m.find())
	      	System.out.println( check.substring( m.start(), m.end() ) );
		}
	}


