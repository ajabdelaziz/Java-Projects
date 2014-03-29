package com.conditions;

import java.util.Scanner;

public class IfelseStatement {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner firstVal = new Scanner (System.in);

		System.out.println("Enter Your Age");
	
		
		int age= firstVal.nextInt();
		
		if(age>=21){
				System.out.println("Enjoy the Party");
		}else{
			System.out.println("Get the hell out of here");
		}
			
	}


}
