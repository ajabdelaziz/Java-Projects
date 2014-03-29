package com.conditions;

import java.util.Scanner;

public class RuntimeException {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Enter Your Value");
		
		int z = scan.nextInt(); 
		
		int x = 100;
		
		int y = 200;
		
		try
		  {
		  System.out.println(x/z);
		  }
		catch( Exception e)
		  {
			System.out.println(e.getMessage());
				
			System.out.println(e.toString());
		  }
		 System.out.println(y+z);
	}
	 
}
