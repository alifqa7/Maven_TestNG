package com.bitm.newtours5th.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bitm.newtours5th.DataProvider.LoginDataProvider;
import com.bitm.newtours5th.dto.loginDTO;
import com.bitm.newtours5th.utils.DriverManager;
import com.bitm.newtours5th.utils.urlTextUtils;
import com.bitm.newtours5th.utils.xPathUtils;

import junit.framework.Assert;

public class LoginTest {
 
 private WebDriver driver = null;
 
 @Test(priority=1)
 public void checkloginpagetitle() {
  driver = DriverManager.driver;
  driver.get(urlTextUtils.BASE_URL);
  Assert.assertEquals(driver.getTitle(), urlTextUtils.LOAD_PAGE_TITLE);
  
  System.out.println("Checked- Login Page Title Successfully !!!!!");
  
 }
 
 @Test(priority=2,dataProvider="loginData",dataProviderClass=LoginDataProvider.class)
 public void logintest(List < loginDTO > logindata) throws InterruptedException  {
  
  for(loginDTO login: logindata) {
  
  driver.findElement(By.xpath(xPathUtils.Login.INPUT_USER_NAME)).sendKeys(login.getUserName());
  driver.findElement(By.xpath(xPathUtils.Login.INPUT_PASSWORD)).sendKeys(login.getPassword());
  driver.findElement(By.xpath(xPathUtils.Login.BTN_SIGNIN)).submit();
  
  System.out.println("Logged in Successfully!");
 }
}
}