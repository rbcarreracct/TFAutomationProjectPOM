package com.tfAutomationProject.testCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TC_RemoveSingleItem_005 extends BaseClassJunitTest{
	
	@Test
	public void RemoveSingleItem()
	{
		logger.info("Removing Single Item");
		
		driver.get(baseURL);
		
		driver.findElement(By.name("todo[0]")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();
		
        String strUrl = driver.getCurrentUrl();
		
		driver.get(strUrl);
			
		Actions act = new Actions(driver); act.sendKeys(Keys.F5).perform();
		
		}
}
