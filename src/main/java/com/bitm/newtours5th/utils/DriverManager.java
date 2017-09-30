package com.bitm.newtours5th.utils;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	static {
		System.setProperty("webdriver.gecko.driver", "E:/Selenium 5th batch/geckodriver-v0.18.0-win64/geckodriver.exe");
	}
	public static WebDriver driver= new FirefoxDriver ();
	
	public void driverexecution()
	{
		System.out.println("Driver executed!");
	}

	@Test
	public void testMethod ()
	{
		System.out.println("done");
	}
	private DriverManager() {

	}


}
