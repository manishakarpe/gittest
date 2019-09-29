package com.newtours.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserObject {
	
	   //page object model - mostly used design pattern
		  // framework-page object - test data - utilities:-1]excel 2]driver 3]screen shot - test script - object repository
	   //Steps to write test case 1] in utility package create browser object class 2] object repository package 3] page object package 4] in test script package create testng class
		//testNG - writing executing reporting	
	//testNG follow steps - test suite - test - class - mthd
	
	static WebDriver driver;
	
	public static WebDriver get(String browserName) throws Exception {
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Desktop\\manisha\\chromedriver_win32\\chromedriver.exe"); //map
			driver = new ChromeDriver();
			
		}else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Sumit\\Desktop\\manisha\\chromedriver_win32\\InternetExplorerDriver.exe"); //map
			 driver = new InternetExplorerDriver();
			
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sumit\\Desktop\\manisha\\chromedriver_win32\\geckoDriver.exe"); //map
			 driver = new FirefoxDriver();
			
		}else {
			throw new Exception("Invalid Browser name: " +browserName);
		}
		return driver;
	}

}
