package com.Netbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class uploadPage {
	
		 WebDriver ldriver;
		 
		 public uploadPage(WebDriver rdriver)
		 {
			 ldriver = rdriver;
			 PageFactory.initElements(rdriver, this);
		 }
		 
		 @FindBy(name="uploadfile_0")
		 @CacheLookup
		 WebElement chooseFilebtn;
		 
		 public void clickchooseFile()
		 {
			 chooseFilebtn.click();
		 }
}
