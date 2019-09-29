package com.newtours.testScripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.newtours.objectRepo.ObjectRepository;
import com.newtours.pageObjects.FlightSearch;
import com.newtours.pageObjects.Login;
import com.newtours.utilities.BrowserObject;
import com.newtours.utilities.Excel;


public class TC003 {
	static WebDriver browser;

	
	@BeforeClass
	public void setUp() throws Exception {
		
		browser  = BrowserObject.get(ObjectRepository.browser);
	}
	
	
  @Test(priority=1)
  public void login() throws Exception {
		browser.get(ObjectRepository.url);
		  
		  ArrayList<String> list = Excel.getRowData("Sheet2", 0);
		  Login.enterUsername(browser, list.get(0));
		  Login.enterPassword(browser, list.get(1));
		  Login.clickLogin(browser);
		  Assert.assertEquals(browser.getTitle(), "Find a Flight: Mercury Tours:");//validation
  }
  
  @Test(priority=2)
  public void flightsearch() throws Exception {
	  ArrayList<String> list = Excel.getRowData("Sheet2", 1);
	  FlightSearch.selectTripType(browser, list.get(0));
	  FlightSearch.selectTripType(browser, list.get(1));
	  FlightSearch.selectTripType(browser, list.get(2));
	  FlightSearch.selectTripType(browser, list.get(3));
	  FlightSearch.selectTripType(browser, list.get(4));
	  FlightSearch.selectTripType(browser, list.get(5));
	  FlightSearch.selectTripType(browser, list.get(6));
  }
}
