
//Test case trying to add duplicate category
package com.tfAutomationProject.testCases;

import java.util.UUID;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tfAutomationProject.pageObjects.ValidateDuplicateCategoryNotAllowed;

public class TC_DuplicateCategory_002 extends TestBaseTFAutomationProject{
	
	
	@Test
	public void addCategory() 
	
	{
		driver.get(baseURL);
		
		ValidateDuplicateCategoryNotAllowed vdc = new ValidateDuplicateCategoryNotAllowed(driver);
		
		
		vdc.setAddCategory(addCat);
		vdc.clickAdd();
		
		
		//switching to new web page when duplicate category is added
		driver.get("https://techfios.com/test/101/delcat.php?cid=453");
		
		//locating message that appears as a result trying to add duplicate category
		String verifyText=driver.findElement(By.tagName("body")).getText().trim();
		
		//verifying text displayed
		Assert.assertEquals(verifyText, "The category you want to add already exists:");
		
	    logger.info("Trying to add duplicate categories displays \t"+verifyText);
		
		driver.findElement(By.linkText("Nevermind")).click();
	}

}
