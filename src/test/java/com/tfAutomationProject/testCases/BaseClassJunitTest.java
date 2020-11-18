package com.tfAutomationProject.testCases;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClassJunitTest {


	public  String baseURL="https://techfios.com/test/101/";

	public  String addCat="test1980";

	public Logger logger = LogManager.getLogger(TestBaseTFAutomationProject.class);

	public static  WebDriver driver;



	@BeforeClass
	public static void setUp()
	{

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver");

		driver=new ChromeDriver();







	}




	@AfterClass
	public static void tearDown()
	{
		driver.quit();
	}
}









