package com.tfAutomationProject.testCases;




import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBaseTFAutomationProject {
	
	public  String baseURL="https://techfios.com/test/101/";
	
	public Logger logger = LogManager.getLogger(TestBaseTFAutomationProject.class);
	
	public  WebDriver driver;
	
	
	
	
	
	
	
	@BeforeClass
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver");
		
		driver=new ChromeDriver();
		
		
		
		
		
		
		
	}
	
	
	

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
