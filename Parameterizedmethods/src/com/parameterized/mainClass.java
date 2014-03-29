package com.parameterized;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
	
	AbstractClass abs = new AbstractClass();
	Scanner scan =  new Scanner(System.in);
	String go = "locOne";
	String userLoc = "locTwo";
	System.out.println("Enter your Username");
	String user = scan.next();
	abs.type(user, userLoc);
	abs.click(go);
	
	
	
	
	
	}
}
