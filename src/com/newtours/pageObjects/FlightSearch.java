package com.newtours.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightSearch {
	
	public static void selectTripType(WebDriver driver, String trip) {
		driver.findElement(By.xpath(".//input[@value='" + trip +"']")).click();
	}
	
	public static void selectPassenger(WebDriver driver, String pass) {
		Select dd = new Select(driver.findElement(By.name("passCount")));
		dd.selectByVisibleText(pass);
	}
	
	public static void departingFrom(WebDriver driver, String depf) {
		Select dd = new Select(driver.findElement(By.name("fromPort")));
		dd.selectByVisibleText(depf);
		
	}
	
	public static void departingOnMonth(WebDriver driver, String month) {
		Select dd = new Select(driver.findElement(By.name("fromMonth")));
		dd.selectByVisibleText(month);
		
	}
	public static void departingOn(WebDriver driver, String day) {
		Select dd = new Select(driver.findElement(By.name("fromDay")));
		dd.selectByVisibleText(day);
		
	}
	
	public static void arrvingIn(WebDriver driver, String arr) {
		Select dd = new Select(driver.findElement(By.name("toPort")));
		dd.selectByVisibleText(arr);
		
	}
	
	public static void returning(WebDriver driver, String ret) {
		Select dd = new Select(driver.findElement(By.name("toMonth")));
		dd.selectByVisibleText(ret);
		
	}
	
	public static void serviceClass(WebDriver driver, String ser) {
		driver.findElement(By.xpath(".//input[@value='" + ser +"']")).click();
	}
	
	public static void airLine(WebDriver driver, String arr) {
		Select dd = new Select(driver.findElement(By.name("airline")));
		dd.selectByVisibleText(arr);
		
	}

	
}
