package com.calculator;

import java.util.Scanner;

public class arthamaticcalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1= ");
		double num1 = sc.nextDouble();
		
		System.out.print("Enter operator (+,-,*,/)");
		char operator = sc.next().charAt(0);
		
		System.out.print("Enter num2= ");
		double num2 = sc.nextDouble();
		double result = 0.0;
		
		System.out.print("result=");
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			System.out.print(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.print(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.print(result);
			break;
		case '/':
			result = num1 / num2;
			System.out.print(result);
			break;
		}
		
	
		
		

	}

	}

