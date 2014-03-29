package com.conditions;

import java.util.Scanner;

public class Forloop {

/*how to create factorials*/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert any integer");
		
		int fact = scan.nextInt();
		
		int i; 
		
		for (i = fact-1; i>0;i--){
				
				fact = fact*i;
				
				}
		
		System.out.println(fact);

		}
}


/*how to increment in terms of 5, and exponentially
  
  for(int i = 100; i>0; i-=5){
 
	
	System.out.println(i);
	
	for(int i = 100; i>0; i*=2){
			
			System.out.println(i);
}*/