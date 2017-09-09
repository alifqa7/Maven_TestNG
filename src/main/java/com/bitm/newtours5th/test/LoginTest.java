package com.bitm.newtours5th.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bitm.newtours5th.utils.DriverManager;
import com.bitm.newtours5th.utils.urlTextUtils;

import junit.framework.Assert;

public class LoginTest {
	private WebDriver driver= null; //everytime it clears the saved cookies
	@Test (priority=1)
	public void checkLoginPageTitle () {
		driver = DriverManager.driver;
		driver.get(urlTextUtils.BASE_URL);
		Assert.assertEquals(driver.getTitle(),urlTextUtils.LOAD_PAGE_TITLE); //char arg, char arg
		System.out.println("checked login page title successfully!");
				
	}
	@Test (priority=2)
	public void loginTest ()
	{
		driver.findElement(By.xpath(xPathUtils.Login.INPUT_USER_NAME)).sendKeys)
		
	}

}
