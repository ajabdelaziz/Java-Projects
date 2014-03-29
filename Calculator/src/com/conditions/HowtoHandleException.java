package com.conditions;

public class HowtoHandleException {
	
	public static void main (String [] args){
		
	int a =10;
	
	int b = 0;
	
	try
	  {
	  System.out.println(a/b);
	  }
	catch( Exception e)
	  {
		System.out.println(e.getMessage());
			
		System.out.println(e.toString());
	  }
	 System.out.println(a+b);
}
}
