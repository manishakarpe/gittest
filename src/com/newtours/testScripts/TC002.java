package com.newtours.testScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC002 {
	
	@BeforeClass
	public void before() {
		System.out.println("Executing before class");
	}
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Executing before method");
	}
	
	@AfterMethod
	public void cleanUp() {
		System.out.println("Executing after method");
	}
	
	
  @Test
  public void f() {
	  System.out.println("this is the test f");
  }
  
  @Test
  public void a() {
	  System.out.println("this is the test a");
  }
}
