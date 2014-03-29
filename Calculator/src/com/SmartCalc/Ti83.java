package com.SmartCalc;

import java.util.Scanner;

public class Ti83 {

	public static void main(String args[]) {

		double x, y, z;
		String operation;

		System.out.print("Enter first Number: ");
		Scanner firstVal = new Scanner(System.in);
		x = firstVal.nextDouble();

		System.out.print("Enter Second Number: ");
		Scanner secondVal = new Scanner(System.in);
		y = secondVal.nextDouble();

		System.out
				.print("Choose your operation:(a-Add/s-subtraction/d-division/m-multiplication): ");
		Scanner operator = new Scanner(System.in);
		operation = operator.next();

		if ("a".equals(operation)) {
			 z = x + y; 
			 System.out.println("The Answer is: " + z);
			 
			

		} else if ("s".equals(operation)) {
			z = x - y; 
			System.out.println("The Answer is: " + z);
			 

			
		} else if ("d".equals(operation)) {
			z = x / y; 
			System.out.println("The Answer is: " + z);
			 


		} else {
			z = x * y;
			System.out.println("The Answer is: " + z);
		}
	}
}