package com.SmartCalc;

/*Homework*/
import java.util.Scanner;


public class Ti80 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner	Calc = new Scanner (System.in);
		
		double a, b, Addition, Subtraction, Multiplication, Division;
		
		
		System.out.println("Enter first value");
		
		a =Calc.nextDouble();
		
		System.out.println("Enter second value");
		
		b = Calc.nextDouble();
		
		String Y= "Your Result is ";
		
		System.out.println("Choose Your Function");
		System.out.println("1-Add, 2-Sub, 3-Mul, 4-Div");
		
		Addition = (a+b);
		
		Subtraction = (a-b);
		
		Multiplication = (a*b);
		
		Division = (a/b);
		
		int Func;
		
		Func= Calc.nextInt();
		
		switch (Func) {
		case 1: 
				System.out.println(Y + Addition);
				break;
		case 2: 
				System.out.println(Y + Subtraction);
				break;
		case 3: 
				System.out.println(Y + Multiplication);
				break;
		case 4:
				System.out.println(Y + Division);
				break;
		default:
				System.out.println("Please Enter Valid Value");
				break;
	
	}
	
}
}
