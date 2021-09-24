package com.Netbanking.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;;

public class Reporting {

		/*public WebDriver driver;
		
		public ExtentReporter htmlreporter;
		public ExtentReports extent;
		public ExtentTest test;
		
		@BeforeTest
		public void setExtent ()
		{
			htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/testoutput/myreport.html");
			
			htmlReporter.config().setDocumentTitle("Automation Report");
			htmlReporter.config().setReportName("Functional Report");
			htmlReporter.config().setTheme(Theme.DARK);
			
			extent = new ExtentReports();
			
			extent.attachReporter(htmlReporter);
			
			extent.setSystemInfo("Hostname", "LocalHost");
			extent.setSystemInfo("OS", "Windows");
			extent.setSystemInfo("Tester Name", "Abhimanyu");
			extent.setSystemInfo("Browser", "Chrome");
		}
		@AfterTest
		public void endReport(){
			extent.flush();
		}
		@BeforeMethod
		public void Setup()
		{
			
		}
		
		@Test
		public void noCommerceTitleTest() {
			test.extent.createtest("noCommerceTitleTest");
			
			
		}*/
}
