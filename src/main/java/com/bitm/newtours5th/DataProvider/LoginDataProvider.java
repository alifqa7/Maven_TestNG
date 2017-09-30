package com.bitm.newtours5th.DataProvider;

import java.io.IOException;

import com.bitm.newtours5th.utils.excelUtils;

public class LoginDataProvider {
	
	@DataProvider(name="loginData")
	 public static Object[][] getLoginData() {
	        try {
	   return new Object[][]{
	     {
	      excelUtils.getLoginData()
	     },
	    };
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	   return null;
	  }         
	    }
}
