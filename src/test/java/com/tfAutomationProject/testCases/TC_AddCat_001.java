
//Test case for adding category using TestNG
package com.tfAutomationProject.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.tfAutomationProject.pageObjects.ValidateAddCategory;

public class TC_AddCat_001 extends TestBaseTFAutomationProject{
	
	
	    //Test to check if new category is added
        @Test
        public void addCategory() 
        {
        //open url	
        driver.get(baseURL);
        logger.info("URL is opened");
		ValidateAddCategory vac =new ValidateAddCategory(driver);
		
		//add new category
		logger.info("add category");
		vac.setAddCategory(addCat);
		
		
		//click on add button
		logger.info("click on add button");
		vac.clickAdd();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//verify new category is displayed
		logger.info("verify new cat is displayed");
		Boolean result = driver.findElement(By.xpath("//span[text()='Test1980']")).isDisplayed();
	    }
		
		
		
		
	
        }
		
	
    
	

	
	

