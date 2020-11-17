package com.tfAutomationProject.testCases;

import java.util.UUID;

import org.junit.Test;
import org.openqa.selenium.By;

public class TC_RemoveAllItems_006 extends BaseClassJunitTest{
	
	@Test
	public void RemoveAll()
	
	{
		driver.get(baseURL);
		
		String uuid = UUID.randomUUID().toString();
		driver.findElement(By.name("data")).sendKeys(uuid);
	
		
		
		driver.findElement(By.name("allbox")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();
		
	}

}
