package com.parameterized;

public class AbstractClass extends Selenium{

	public void click(String loc){
		clickMethod(loc);
	}
	
	public void type(String user, String loc){
		typeInTextBox(user, loc);
	}
}

