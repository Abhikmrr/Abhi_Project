package com.Netbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Netbanking.utilities.ReadConfig;



public class BaseClass{
	
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL= readconfig.getApplicationURL();
	public String uploadURL= readconfig.getUploadURL();
	public String username =readconfig.getUserName();
	public String password =readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		//System.getProperty("user.dir")+ can be replaced by ./ as well for getting the project home path
		driver =new ChromeDriver();
		}
		
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			//System.getProperty("user.dir")+ can be replaced by ./ as well for getting the project home path
			driver =new FirefoxDriver();
			}
		
		if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			//System.getProperty("user.dir")+ can be replaced by ./ as well for getting the project home path
			driver =new InternetExplorerDriver();
			}
		logger = Logger.getLogger("Netbanking_v1");
		PropertyConfigurator.configure("log4j.properties");
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
