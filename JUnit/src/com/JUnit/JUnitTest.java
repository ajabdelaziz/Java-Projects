package com.JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest {

	@BeforeClass
	public static void openBrowser(){
		
		System.out.println("Open Chrome Browser");
		System.out.println("Open Google Homepage");
	}
	
	@Before
	public void clickOnMail (){
		System.out.println("Click On Main Button and Open Google login page");
		
	}
	
	@Test
	public void TestOne(){ 
		System.out.println("Insert Username");
		System.out.println("Insert Password");
		System.out.println("Click SignInButton and open email page");
	
	}

	
	@After
	public void logout(){
		System.out.println("Click on Log out button");
	}
	
	@AfterClass
	public static void Close(){
		System.out.println("Close Browser");
	}
	
	
	
	
	

	}


