package com.tfAutomationProject.testCases;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class TC_ToggleAllChecked_004 extends BaseClassJunitTest{
	
	
	//String strUrl = driver.getCurrentUrl();
	

	
	@Test
	public void AddItem() throws InterruptedException
	{
		driver.get(baseURL);
		String uuid = UUID.randomUUID().toString();
		driver.findElement(By.name("data")).sendKeys(uuid);
	
		
		
		WebElement textToAdd = driver.findElement(By.xpath("/html/body/div[4]/input[2]"));
		textToAdd.click();
		
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String strUrl = driver.getCurrentUrl();
		
		driver.get(strUrl);
			
		Actions act = new Actions(driver); act.sendKeys(Keys.F5).perform();
	
		//driver.findElement(By.name("data")).sendKeys(uuid);
		
		driver.get(baseURL);
		
		
		driver.findElement(By.name("allbox")).click();
		
		//driver.findElement(By.name("allbox")).click();
		
		System.out.println(strUrl);
		}
	
	//TC_ToggleAllChecked tcTAC = new TC_ToggleAllChecked();
	
	//public TC_ToggleAllChecked() throws InterruptedException {
		//AddItem();
		
		//driver.get(baseURL);
		//driver.findElement(By.name("allbox")).click();
		
		
	//}
		//public void allBoxChecked()
	
		//{
			//driver.get(baseURL);
			//driver.findElement(By.name("allbox")).click();
		//}
		
		
	}
	
	


