package com.Netbanking.utilities;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class Reporting_ER extends TestListenerAdapter{
	
	/*public ExtentReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	
	public void onTestStart(ITestResult testContext) {
		System.out.println("Test started");
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//timestamp
		String repName = "Test-Report-"+timeStamp+".html;"
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir"));
	}
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test passed");
	}
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test failed");
	}
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test Skipped");
	}*/

}
