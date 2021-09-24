package com.Netbanking.testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Netbanking.pageObjects.LoginPage;

//import junit.framework.Assert;

public class TC001_LoginTest extends BaseClass{ 

	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		logger.info("URL opened");
		driver.manage().window().maximize();
		logger.info("Browser maximised");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username entered");
		lp.setPassword(password);
		logger.info("Password entered");
		lp.clickSubmit();
		logger.info("Clicked Submit");
		
		SoftAssert softassert = new SoftAssert();
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			softassert.assertTrue(true);
			logger.info("TestCase Passed");
		}
		else
		{
			softassert.assertTrue(false);
			logger.info("TestCase Failed");
		}
		
		softassert.assertAll();
	}
}
