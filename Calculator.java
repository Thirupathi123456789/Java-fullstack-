package com.project;

import java.util.Scanner;

public class Calculator {

	public static void main(String arg[]) {
		
		Scanner scan = new Scanner(System.in);
		
	    System.out.println("Enter first number");
		int a = scan.nextInt();

		System.out.println("Enter second number");
		int b = scan.nextInt();
		System.out.println("enter the symbols");
		String operator=scan.next();
		int result;

	    switch (operator) {

	     
	      case "+":
	        result = a+b;
	        System.out.println(a + " + " + b + " = " + result);
	        break;

	     
	      case "-":
	        result =a - b;
	        System.out.println(a + " - " + b + " = " + result);
	        break;

	     
	      case "*":
	        result = a * b;
	        System.out.println(a + " * " + b + " = " + result);
	        break;

	      
	      case "/":
	        result = a / b;
	        System.out.println(a + " / " + b + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	  
		
	}

}

